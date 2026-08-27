import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        var digiteProduto = "Digite o nome do produto!";
        var digiteValor = "Digite o valor!";

        int opcao;
        String produto;
        Double valor;

        do {
            System.out.println("\n==== MENU DE ATRIBUTOS ===");
            System.out.println("1 - Alimentacão");
            System.out.println("2 - Saude e Bem Estar");
            System.out.println("3 - Vestuario");
            System.out.println("4 - Cultura");
            System.out.println("0 - Sair");
            System.out.println("Selecione o tipo de produto:");

            opcao = leitor.nextInt();


            TributoProduto servico = input(opcao);

            if (servico != null){
                System.out.println(digiteProduto);
                produto = leitor.next();
                System.out.println(digiteValor);
                valor = leitor.nextDouble();
                servico.valorDeImposto(produto, valor);
            } else if (opcao != 0){
                System.out.println("Digito invalido");
            }

            
        } while (opcao != 0);
        leitor.close();
        System.out.println("Saindo...");

        }
    

    public static TributoProduto input (int opcao){

        return switch(opcao){
            case 1 -> new Alimentacao();
            case 2 -> new Saudee();
            case 3 -> new Vestuario();
            case 4 -> new Cultura();
            default -> null;
    };
}
}
