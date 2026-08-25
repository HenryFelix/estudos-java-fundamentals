package Domain;
public sealed class Ingresso permits MeiaEntrada, Familia  {
    protected double valor;
    protected String filme;
    protected boolean dublado;

    public Ingresso (double valor, String filme, boolean dublado){
        this.valor = valor;
        this.filme = filme;
        this.dublado = dublado;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(final double valor){
        this.valor = valor;
    }

    public String getFilme(){
        return filme;
    }

    public void setFilme(final String filme){
        this.filme = filme;
    }

    public boolean getDublado(){
        return dublado;
    }

    public void setDublado(final boolean dublado){
        this.dublado = dublado;
    }
}
