public sealed abstract class Funcionario permits Gerente, Vendedor, Atendente {
    protected String nome;
    protected String email;
    protected int senha;
    protected boolean administrador;

    public Funcionario (String nome, String email, int senha, boolean administrador){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(final String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(final String email){
        this.email = email;
    }

    public int getSenha(){
        return senha;
    }

    public void setSenha(final int senha){
        this.senha = senha;
    }

    public boolean isAdministrador(){
        return administrador;
    }

    public void setAdministrador(final boolean administrador){
        this.administrador = administrador;
    }

    public void realizarLogin(){
        System.out.println("Login realizado com sucesso!");
    }

    public void realizarLogoff(){
        System.out.println("Logoff realizado com sucesso!");
    }



}
