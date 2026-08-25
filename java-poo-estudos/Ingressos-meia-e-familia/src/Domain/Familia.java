package Domain;
public non-sealed class Familia extends Ingresso {
    private int pessoas;

    public Familia(double valor, String filme, boolean dublado, int pessoas){
        super(valor, filme, dublado);
        this.pessoas = pessoas;

    }

    @Override
    public double getValor(){
        double valortotal = this.pessoas * valor;
        if (this.pessoas > 3){
            valortotal = valortotal - (valortotal * 0.05);
        }
        return valortotal;
    }

}
