import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Opcao4 {

    Scanner teclado = new Scanner(System.in);

    List<Aluno> alunos = new ArrayList<>();
    
    public void EditarRegistro (Scanner teclado, List <Aluno> alunos) {
        System.out.println("\nDigite o RA do aluno que vai ser editado: ");
                String RApesquisa = teclado.nextLine();
                Aluno pesquisado = null;

                for (Aluno aluno : alunos) {
                    if (aluno.getRA().equals(RApesquisa)) {
                        pesquisado = aluno;
                        break;
                    }
                }

                    if (pesquisado == null) {
                    System.out.println("\nNenhum aluno encontrado. ");  
                    } 

                        String edit;
                        do {
                        System.out.println("\nAluno encontrado! \n\nEscolha o que deseja editar: \n1 - Nome \n2 - RA \n3 - CPF \n4 - Email \n5 - Telefone \n6 - Curso \n7 - Periodo  \n8 - Sair \n");
                        edit = teclado.nextLine();
                        switch (edit) {
                            case "1", "Nome", "nome":
                            System.out.println("\nNome atual: " + pesquisado.getNome() + "\nQual será o novo nome do aluno: ");
                            String novoNome = teclado.nextLine();
                            if (!novoNome.isEmpty()) pesquisado.setNome(novoNome); {
                                System.out.println("\nNome atualizado! \n");
                            }
                            System.out.print("\n");
                            RepositorioAlunos.salvarAlunos(alunos);
                            break;
                            case "2", "RA", "Ra", "ra":
                            System.out.println("\nRA atual: " + pesquisado.getRA() + "\nQual será o novo Registro Acadêmico (RA) do aluno: ");
                            String novoRA = teclado.nextLine();
                            if (!novoRA.isEmpty()) pesquisado.setRA(novoRA); {
                                System.out.println("\nRA atualizado! \n");
                            }
                            System.out.print("\n");
                            RepositorioAlunos.salvarAlunos(alunos);
                            break;
                            case "3", "CPF", "Cpf", "cpf":
                            System.out.println("\nCPF atual: " + pesquisado.getCpf() + "\nQual será o novo CPF do aluno: ");
                            String novoCPF = teclado.nextLine();
                            if (!novoCPF.isEmpty()) pesquisado.setCpf(novoCPF); {
                                System.out.println("\nCPF atualizado! \n");
                            }
                            System.out.print("\n");
                            RepositorioAlunos.salvarAlunos(alunos);
                            break;
                            case "4", "Email", "email":
                            System.out.println("\nEmail atual:" + pesquisado.getEmail() + "\nQual será o novo email do aluno: ");
                            String novoEmail = teclado.nextLine();
                            if (!novoEmail.isEmpty()) pesquisado.setEmail(novoEmail); {
                                System.out.println("\nEmail atualizado! \n");
                            }
                            System.out.print("\n");
                            RepositorioAlunos.salvarAlunos(alunos);
                            break;
                            case "5", "Telefone", "telefone":
                            System.out.println("\nTelefone atual: " + pesquisado.getTelefone() + "\nQual será o novo telefone do aluno: ");
                            String novoTelefone = teclado.nextLine();
                            if (!novoTelefone.isEmpty()) pesquisado.setTelefone(novoTelefone); {
                                System.out.println("\nTelefone atualizado! \n");
                            }
                            System.out.print("\n");
                            RepositorioAlunos.salvarAlunos(alunos);
                            break;
                            case "6", "Curso", "curso":
                            System.out.println("\nCurso atual: " + pesquisado.getCurso() + "\nQual será o novo curso do aluno: ");
                            String novoCurso = teclado.nextLine();
                            if (!novoCurso.isEmpty()) pesquisado.setCurso(novoCurso); {
                                System.out.println("\nCurso atualizado! \n");
                            }
                            System.out.print("\n");
                            RepositorioAlunos.salvarAlunos(alunos);
                            break;
                            case "7", "Periodo", "periodo":
                            System.out.println("\nPeríodo atual: " + pesquisado.getPeriodo() + "\nQual será o novo período do aluno: ");
                            String novoPeriodo = teclado.nextLine();
                            if (!novoPeriodo.isEmpty()) pesquisado.setPeriodo(novoPeriodo); {
                                System.out.println("\nPeríodo atualizado! \n");
                            }
                            System.out.print("\n");
                            RepositorioAlunos.salvarAlunos(alunos);
                            break;
                            case "8", "Sair", "sair":
                            break;
                        
                        }
                        } while (!edit.equals("8") && !edit.equalsIgnoreCase("Sair"));
                        System.out.print("\n");
                    
                     
                }

    }