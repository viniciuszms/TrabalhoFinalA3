import java.util.Scanner;
import java.util.List;

public class Menu {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        RepositorioAlunos repositorio = new RepositorioAlunos();
        List<Aluno> alunos = repositorio.carregarAlunos();

        System.out.println("O que deseja fazer? ");
        String resposta;

        do {
        System.out.println("\n1 - Criar novo registro \n2 - Listar todos os registros \n3 - Buscar registro por RA \n4 - Editar registro \n5 - Excluir registro \n6 - Sair \n");
        resposta = teclado.nextLine();
        switch (resposta) {
            case "1", "Criar novo registro", "criar novo registro":
             Opcao1 opcao1 = new Opcao1();
             opcao1.CriarRegistro(teclado,alunos);
             break;
            case "2", "Listar todos os registros", "listar todos os registros":
             Opcao2 opcao2 = new Opcao2();
             opcao2.ListarRegistro(teclado, alunos);    
             break;
            case "3", "Buscar registro por RA", "buscar registro por RA":
             Opcao3 opcao3 = new Opcao3();
             opcao3.BuscarRegistro(teclado, alunos);
                break;
            case "4", "Editar registro", "editar registro":
             Opcao4 opcao4 = new Opcao4();
             opcao4.EditarRegistro(teclado, alunos);
                break;
            case "5", "Excluir registro", "excluir registro":
             Opcao5 opcao5 = new Opcao5();
             opcao5.ExcluirRegistro(teclado, alunos);
                break;
            case "6", "Sair", "sair":
                break;
            default: 
                System.out.println("\nOpção inválida! Digite um número de 1 a 6 para realizar a ação. \n");
        }
    
    } while (!resposta.equalsIgnoreCase("sair") && !resposta.equals("6"));
        System.out.println("\nFim do programa.");

        teclado.close();
 }
}
