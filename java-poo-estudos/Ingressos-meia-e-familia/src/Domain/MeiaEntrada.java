package Domain;
public non-sealed class MeiaEntrada extends Ingresso {

    public MeiaEntrada (double valor, String filme, boolean dublado) {
    super(valor, filme, dublado);
    }

    @Override
    public double getValor(){
        return valor / 2;
    }
}
