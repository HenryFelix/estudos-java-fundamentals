public class Alimentacao implements TributoProduto{
private double imposto;

    public Alimentacao (){
        this.imposto = 1;
    }


    @Override
    public void valorDeImposto(String nome, double valor){
        valor = valor - (valor * (imposto / 100));
        System.out.println("O valor total com imposto do " + nome + "e: " + valor);
    }

    @Override
    public void getImposto(){
        System.out.println(imposto + "%");
    }
}
