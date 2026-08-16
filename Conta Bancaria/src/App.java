import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ContaBancaria minhaConta = new ContaBancaria(400);
        int opcao;

        do {
            System.out.println("\n==== MENU DO CAIXA ELETRONICO ===");
            System.out.println("1 - Consultar Saldo ");
            System.out.println("2 - Sacar ");
            System.out.println("3 - Depositar ");
            System.out.println("0 - Sair ");
            System.out.print("Escolha uma opção: ");

            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    minhaConta.consultarSaldo();
                    break;
                case 2:
                    System.out.println("Digite o valor para sacar: ");
                    double valorSaque = leitor.nextDouble();
                    minhaConta.sacar(valorSaque);
                    break;
                case 3:
                    System.out.println("Digite o valor para depositar: ");
                    double valorDeposito = leitor.nextDouble();
                    minhaConta.depositar(valorDeposito);
                    break;
                case 0:
                    System.out.println("Obrigado por usar nosso banco!");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
         } while (opcao != 0);
                leitor.close();



            }
        } 
    

