import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Opcao3 {

    Scanner teclado = new Scanner(System.in);

    List<Aluno> alunos = new ArrayList<>();

    public void BuscarRegistro (Scanner teclado, List <Aluno> alunos) {
    
    System.out.println("\nDigite o Registro Acadêmico (RA): ");
                String RApesquisa = teclado.nextLine();

                Aluno pesquisado = null;

                for (Aluno aluno : alunos) {
                    if (aluno.getRA().equals(RApesquisa)) {
                        pesquisado = aluno;
                        System.out.println("\nAluno encontrado! \n");
                        break;
                    }    
                }

                if (pesquisado != null) {
                    pesquisado.exibirInformacoes();
                    System.out.print("\n");
                } else {
                    System.out.println("Nenhum aluno encontrado. \n");
                }
    }
}