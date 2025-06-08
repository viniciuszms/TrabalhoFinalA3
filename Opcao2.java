import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Opcao2 {

    Scanner teclado = new Scanner(System.in);

    List<Aluno> alunos = new ArrayList<>();

    public void ListarRegistro (Scanner teclado, List <Aluno> alunos) {

        System.out.println("\nInformações dos alunos: \n");

    for (Aluno aluno : alunos) {
                    aluno.exibirInformacoes();
                    System.out.print("\n");
                }
            }
}
