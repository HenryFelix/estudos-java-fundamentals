public non-sealed class Vendedor extends Funcionario {
    protected int venda;

    public Vendedor (String nome, String email, int senha){
        super(nome, email,senha, false);
        this.venda = 0;
    }

    public void realizarVenda(){
        this.venda += 1;
    }

    public int getVenda(){
        return venda;
    }

}
