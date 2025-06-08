import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Opcao1 {

    Scanner teclado = new Scanner(System.in);

    List<Aluno> alunos = new ArrayList<>();

        public void CriarRegistro (Scanner teclado, List <Aluno> alunos) throws Exception {

            System.out.println("\nNome: ");
            String nome = teclado.nextLine();
            System.out.println("RA: ");
            String RA = teclado.nextLine();
            System.out.println("CPF: ");
            String cpf = teclado.nextLine();
            System.out.println("Email: ");
            String email = teclado.nextLine();
            System.out.println("Telefone: ");
            String telefone = teclado.nextLine();
            System.out.println("Curso: ");
            String curso = teclado.nextLine();
            System.out.println("Período: ");
            String periodo = teclado.nextLine();

            Aluno novoAluno = new Aluno (nome, RA, cpf, email, telefone, curso, periodo);

            for (Aluno aluno : alunos) {
                if (aluno.getRA().equals(novoAluno.getRA())) {
                    throw new DadoRepetido("Erro: já existe um aluno com o RA " + novoAluno.getRA() + "\nRefaça a operação com um novo RA para criar o registro do aluno.");
                }
            }

            for (Aluno aluno : alunos) {
                if (aluno.getCpf().equals(novoAluno.getCpf())) {
                    throw new DadoRepetido("Erro: já existe um aluno com o CPF " + novoAluno.getCpf() + "\nRefaça a operação com um novo CPF para criar o registro do aluno.");
                }
            }

            alunos.add(novoAluno);

            RepositorioAlunos.salvarAlunos(alunos);

            System.out.println("\nAluno cadastrado! \n");

        }

    }