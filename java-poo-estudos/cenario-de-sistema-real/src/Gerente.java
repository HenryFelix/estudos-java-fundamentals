public non-sealed class Gerente extends Funcionario{
    protected int anosDeEmpresa;
    
    public Gerente (String nome, String email, int senha, int anosDeEmpresa){
        super(nome, email, senha,true);
        this.anosDeEmpresa = anosDeEmpresa;

    }

    public void calcularBonus(double salarioBase){
        double salario;
        if (this.anosDeEmpresa > 5){
            salario = salarioBase * 0.3;
        } else {
            salario = salarioBase * 0.2;
        }
        System.out.println("O bônus total do gerente é: " + salario);
    } 

}
