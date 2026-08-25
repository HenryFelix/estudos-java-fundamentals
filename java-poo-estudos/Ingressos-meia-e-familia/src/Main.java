import Domain.Familia;
import Domain.Ingresso;
import Domain.MeiaEntrada;

public class Main {
    public static void main(String[] args) {
        
        Ingresso ingressoNormal = new Ingresso(40.0, "Matrix", true);
        Ingresso ingressoMeia = new MeiaEntrada(40.0, "Matrix", true);
        Ingresso familiaPequena = new Familia(40.0, "Matrix", true, 3);
        Ingresso familiaGrande = new Familia(40.0, "Matrix", true, 4)
        System.out.println("Valor Normal: R$ " + ingressoNormal.getValor());
        System.out.println("Valor Meia: R$ " + ingressoMeia.getValor());
        System.out.println("Valor Família 3 : R$ " + familiaPequena.getValor());
        System.out.println("Valor Família 4 : R$ " + familiaGrande.getValor());
    }
}