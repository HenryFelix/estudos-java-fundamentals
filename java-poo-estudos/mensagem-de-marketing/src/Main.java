import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        var chamarMensagem = "Escreva sua mensagem";
        int opcao;
        String mensa;
        do {
            System.out.println("\n==== MENU DE MENSAGEM ===");
            System.out.println("1 - Email ");
            System.out.println("2 - SMS ");
            System.out.println("3 - WhatsApp ");
            System.out.println("4 - Redes Sociais ");
            System.out.println("0 - Sair ");
            System.out.print("Escolha uma opção: ");

            opcao = leitor.nextInt();
            Marketing servicoEscolhido = criarServico(opcao);
            
            if (servicoEscolhido != null) { 
                System.out.println(chamarMensagem);        
                mensa = leitor.next();
                servicoEscolhido.mensagem(mensa);
            } else if (opcao != 0){
                System.out.println("Invalida"); 
            }

        } while (opcao != 0);
        leitor.close();
        } public static Marketing criarServico(int opcao){
            
            return switch(opcao){
                case 1 -> new Email();
                case 2 -> new SMS();
                case 3 -> new WhatsApp();
                case 4 -> new RedesSociais();
                default -> null;
        };
    }

        
    }
