public class Cultura implements TributoProduto{
private double imposto;

    public Cultura (){
        this.imposto = 4;
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
