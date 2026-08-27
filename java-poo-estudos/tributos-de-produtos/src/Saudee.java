public class Saudee implements TributoProduto{

private double imposto;

    public Saudee (){
        this.imposto = 1.5;
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
