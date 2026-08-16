import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner (System.in);  
        /* System.out.print("Insira um numero: ");
        var numero = scanner.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i) );
        }
        System.out.println("====================");
 */
        /* System.out.println("Insira seu peso");
        var peso = scanner.nextDouble();
        System.out.println("Insira sua altura");
        var altura = scanner.nextDouble();
        var imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");

        } else if (imc >= 18.6 && imc < 25) {
            System.out.println("Peso ideal");

        } else if (imc >= 25.0 && imc < 30) {
            System.out.println("Levemente acima do seu peso");

        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade Grau I");

        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade Grau II (Severa)");

        } else if (imc >= 40) {
            System.out.println("Obesidade Grau III (Morbida)");
        } */

        /* System.out.println("Insira o primeiro numero: ");
        var numero1 = scanner.nextInt();
        System.out.println("escreva um numero maior que o primeiro");
        var numero2 = scanner.nextInt();

        while (numero1 >= numero2) {
            System.out.println("escreva um numero maior que o primeiro");
        numero2 = scanner.nextInt();
        }
        System.out.println("escreva 1 para par, 2 para impar");
        var opcao = scanner.nextInt();
        for (int i = numero2; i >= numero1; i--) {
        
            if (opcao == 1 && i % 2 == 0) {
                System.out.println(i);

            }else if (opcao == 2 && i % 2 != 0) {
                System.out.println(i);
            }
        } */
       System.out.println("Informe um numero inicial");
       var numero = scanner.nextInt();
       while (true) {
        System.out.println("Informe N numero");
        var verificar = scanner.nextInt();
        if (verificar < numero) {
            System.out.println("Informe um numero maior que o primeiro \n");
            continue;
        }
        var result = verificar % numero;
        System.out.printf("%s %% %s = %s \n", numero, verificar, result);
        if (result != 0) {
            break;
        }
       }
    }
}
    

