import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Opcao5 {

    Scanner teclado = new Scanner(System.in);

    List<Aluno> alunos = new ArrayList<>();

    public void ExcluirRegistro (Scanner teclado, List <Aluno> alunos) {
        System.out.println("\nDigite o Registro Acadêmico (RA) do aluno que vai ser excluído: ");
                String RApesquisa = teclado.nextLine();

                Aluno alunoExcluido = null;
                for (Aluno aluno : alunos) {
                    if (aluno.getRA().equals(RApesquisa)) {
                        alunoExcluido = aluno;
                        break;
                    }
                }
                if (alunoExcluido != null) {
                    System.out.println("\nAluno(a) " + alunoExcluido.getNome() + " encontrado! \nDigite " + "SIM " + "para confirmar. \n");
                    if (teclado.nextLine().equalsIgnoreCase("sim")); {
                        alunos.remove(alunoExcluido);
                        RepositorioAlunos.salvarAlunos(alunos);
                        System.out.println("\nAluno removido com sucesso! \n");
                    }
                } else {
                    System.out.println("Aluno não encontrado! Tente novamente. ");
                }

    }
    
}