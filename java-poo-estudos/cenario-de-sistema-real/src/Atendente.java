public non-sealed class Atendente extends Funcionario {
    protected double caixa;

    public Atendente(String nome, String email, int senha){
        super(nome, email, senha, false);
        this.caixa = 0;
    }

    public void receberPagamento(double pagamento){
        this.caixa += pagamento;
    }

    public double getCaixa(){
        return caixa;
    }

    public void fecharCaixa(){
        System.out.println("Valor total arrecadado: " + this.caixa + " | Fechando caixa...");
        this.caixa = 0;
    }

}
