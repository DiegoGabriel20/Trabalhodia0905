import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


    public static void iniciarSistema() {
        boolean executando = true;
        while (executando) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    adicionarFuncionario();
                    break;
                case 2:
                    removerFuncionario();
                    break;
                case 3:
                    exibirFuncionarios();
                    break;
                case 4:
                    executando = false;
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\n=== Sistema de Gerenciamento de Funcionários ===");
        System.out.println("1. Adicionar Funcionário");
        System.out.println("2. Remover Funcionário");
        System.out.println("3. Exibir Funcionários");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarFuncionario() {
        System.out.println("\nAdicionar Funcionário:");
        System.out.println("Selecione o tipo de funcionário:");
        System.out.println("1. Gerente");
        System.out.println("2. Desenvolvedor");
        System.out.println("3. Estagiário");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();

        switch (tipo) {
            case 1:
                System.out.print("Salário Base: ");
                double salarioBase = scanner.nextDouble();
                System.out.print("Bônus Anual: ");
                double bonusAnual = scanner.nextDouble();
                funcionarios.add(new Gerente(nome, matricula, salarioBase, bonusAnual));
                break;
            case 2:
                System.out.print("Horas Trabalhadas: ");
                int horasTrabalhadas = scanner.nextInt();
                funcionarios.add(new Desenvolvedor(nome, matricula, horasTrabalhadas, horasTrabalhadas));
                break;
            case 3:
                System.out.print("Horas Trabalhadas: ");
                int horasEstagiario = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer do scanner
                System.out.print("Supervisor: ");
                String supervisor = scanner.nextLine();
                funcionarios.add(new Estagiario(nome, matricula, horasEstagiario, supervisor));
                break;
            default:
                System.out.println("Tipo de funcionário inválido.");
        }
    }

    private static void removerFuncionario() {
        System.out.println("\nRemover Funcionário:");
        System.out.print("Matrícula do funcionário a ser removido: ");
        String matricula = scanner.nextLine();

        boolean removido = false;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getMatricula().equals(matricula)) {
                funcionarios.remove(funcionario);
                removido = true;
                System.out.println("Funcionário removido com sucesso.");
                break;
            }
        }

        if (!removido) {
            System.out.println("Funcionário não encontrado.");
        }
    }

    private static void exibirFuncionarios() {
        System.out.println("\nLista de Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}


    
