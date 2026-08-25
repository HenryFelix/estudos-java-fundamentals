import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Carro meuCarro = new Carro();
        int opcao;
        do {
            System.out.println("\n ===MENU DO CARRO===");
            System.out.println("1 - Ligar o Carro");
            System.out.println("2 - Desligar o Carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Virar para esquerda");
            System.out.println("6 - Virar para direita");
            System.out.println("7 - Verificar velocidade");
            System.out.println("8 - Trocar marcha");
            System.out.println("0 - Sair");

            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    meuCarro.ligar();
                    meuCarro.status();
                    break;
                case 2:
                    meuCarro.desligar();
                    meuCarro.status();
                    break;
                case 3:
                    meuCarro.acelerar();
                    meuCarro.status();
                    break;
                case 4:
                    meuCarro.diminuirVelocidade();
                    meuCarro.status();
                    break;
                case 5:
                    meuCarro.virarEsquerda();
                    meuCarro.status();
                    break;
                case 6:
                    meuCarro.virarDireita();
                    meuCarro.status();
                    break;
                case 7:
                    meuCarro.verificarVelocidade();
                    break;
                case 8:
                    System.out.println("Escolha a marcha");
                    int marcha = leitor.nextInt();
                    meuCarro.trocarMarcha(marcha);
                    meuCarro.status();
                    break;
                case 0:
                    System.out.println("Voce saiu do carro");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                
            }

        } while (opcao != 0);
        leitor.close();
    }
    
}
