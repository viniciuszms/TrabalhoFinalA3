import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.List;
import java.util.ArrayList;

public class RepositorioAlunos {
    
    private static final String ARQUIVO = "alunos.txt";

    public List<Aluno> carregarAlunos() {
    List<Aluno> alunos = new ArrayList<>();
        
    try (BufferedReader leitor = new BufferedReader(new FileReader(ARQUIVO))) {
        String linha;

        while ((linha = leitor.readLine()) != null) {
            String[] parte = linha.split(",");

            if (parte.length == 7) {
            String nome = parte [0];
            String RA = parte [1];
            String cpf = parte [2];
            String email = parte [3];
            String telefone = parte [4];
            String curso = parte [5];
            String periodo = parte [6];
            

            Aluno aluno = new Aluno (nome, RA, cpf, email, telefone, curso, periodo);
            alunos.add(aluno);
            }
        }
        
    } catch (IOException erro) {
        System.out.println("Erro ao carregar alunos! ");
        erro.printStackTrace();
    }

    return alunos;

}

    public static void salvarAlunos (List<Aluno> alunos) {
        String linha = null;
            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(ARQUIVO))) {
                for (Aluno aluno : alunos)  {
                    linha = aluno.getNome() + "," + aluno.getRA() + "," + aluno.getCpf() + "," + aluno.getEmail() + "," + aluno.getTelefone() + "," + aluno.getCurso() + "," + aluno.getPeriodo();
                    escritor.write(linha);
                    escritor.newLine();
                }
            } catch (IOException erro) {
                System.out.println("Erro ao salvar alunos! ");
                erro.printStackTrace();
            }

    }
}