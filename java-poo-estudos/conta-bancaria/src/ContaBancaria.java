public class ContaBancaria {
    double saldo;
    double limiteChequeEspecial;
    double usoChequeEspecial;

public ContaBancaria(double depositoInicial) {
    this.saldo = depositoInicial;

    this.usoChequeEspecial = 0;

    if(depositoInicial <= 500) {
        this.limiteChequeEspecial = 50.0;
    } else {
        this.limiteChequeEspecial = depositoInicial * 0.5;
    }
    
}

public void consultarSaldo() {
    System.out.println("Saldo atual: R$ " + this.saldo);
    System.out.println("Uso do cheque especial: R$ " + this.usoChequeEspecial);
}

public boolean estaUsandoChequeEspecial() {
    return this.usoChequeEspecial > 0;
}

public void sacar(double valor) {
    if (valor <= this.saldo) {
        this.saldo -= valor;
    } else if (valor <= this.saldo + this.limiteChequeEspecial - this.usoChequeEspecial) {
        double restante = valor - this.saldo;
        this.saldo = 0;
        this.usoChequeEspecial += restante;
    } else {
        System.out.println("Saldo e limite insuficientes");
    }

}

public void depositar (double valor) {
    if (!this.estaUsandoChequeEspecial()) {
        this.saldo += valor;
    } else {
        var taxa = this.usoChequeEspecial * 0.2;
        valor -= this.usoChequeEspecial + taxa;
        this.usoChequeEspecial = 0;
        saldo += valor;
    }
}
}