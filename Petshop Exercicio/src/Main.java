import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        Petshop meuPetshop = new Petshop();
        int opcao;
        do {
            System.out.println("\n ===MENU DA MAQUINA===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer com água e shampoo");
            System.out.println("3 - Status");
            System.out.println("4 - Colocar pet na maquina");
            System.out.println("5 - Retirar pet da máquina");
            System.out.println("6 - Limpar maquina.");
            System.out.println("0 - Sair");
            System.out.println("\n ===================");

            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    colocarPetNaMaquina();
                    meuPetshop.darBanho();
                    break;

                case 2:
                    System.out.println("Digite a agua");
                    int agua = scanner.nextInt();
                    System.out.println("Digite o shampoo");
                    int shampoo = scanner.nextInt();
                    meuPetshop.abastecer(agua, shampoo);
                    break;
                
                case 3:
                    meuPetshop.Status();
                    break;
                case 4:
                    Pet petCriado = colocarPetNaMaquina();
                    meuPetshop.colocarPet(petCriado);
                    break;
                
                    


            }
        } while (opcao != 0);
        scanner.close();

    } public static Pet colocarPetNaMaquina() {
        System.out.println("Digite o nome do pet");
        var name = scanner.next();
        var get = new Pet(name);
        return get;
    }
} 
