public class Petshop {
    private int nivelAgua;
    private int nivelShampoo;
    private int petQuantidade;
    private boolean petLimpo;
    private boolean maquinaLimpa;
    private Pet pet;

    public Petshop() {
        this.nivelAgua = 30;
        this.nivelShampoo = 10;
        this.petQuantidade = 0;
        this.petLimpo = false;
        this.maquinaLimpa = true;
    }

    public void darBanho() {
        if (this.pet == null) {
            System.out.println("Nao tem pet");
            return;
        } else if (this.maquinaLimpa == false) {
            System.out.println("Limpe a maquina para dar banho");
            return;
        } else if (this.nivelAgua < 10 || this.nivelShampoo < 2) {
            System.out.println("Nivel de agua ou shampoo insuficiente");
            return;
        }
        this.pet.setpetLimpo(true);
        this.nivelAgua -= 10;
        this.nivelShampoo -= 2;
        System.out.println("Banho concluido");
    }

    public void abastecer(int valorAgua, int valorShamp) {
        if (valorAgua > 2 || valorShamp > 2) {
            System.out.println("Sao permitidos 2 litros por vez");
            return;
        }
        if (this.nivelAgua + valorAgua > 30 || this.nivelShampoo + valorShamp > 10) {
            System.out.println("Nivel maximo de capacidade de agua ou shampoo");
            return;
        }
        this.nivelAgua += valorAgua;
        this.nivelShampoo += valorShamp;
        Status();
    }

    public void Status () {
        if (this.pet != null) {
            petQuantidade = 1;
        } else {
            petQuantidade = 0;
        }
        System.out.println("Nivel da agua: " + nivelAgua + " | Nivl do shampoo: " + nivelShampoo + " | Pets: " + petQuantidade );
    }

    public void colocarPet (Pet novoPet) {
        if (this.pet != null) {
            System.out.println("Ha um pet na maquina. Nao foi possivel colocar pet");
            return;
        }
        this.pet = novoPet;
    } 

    public void tirarPet (){
        if (this.pet == null) {
            System.out.println("Nao ha nenhum pet na maquina");
            return;
        } 
        if (this.pet.isPetLimpo() == false) {
            this.maquinaLimpa = false;
            this.pet = null;
            System.out.println("O pet saiu sujo. Limpe a maquina.");
        } else {
        System.out.println("O pet " + this.pet.getName() + " esta limpo");
        }
        this.pet = null;
    }

    public void limparMaquina() {
        if (this.maquinaLimpa == true) {
            System.out.println("A maquina ja esta limpa!");
            return;
        }else if (this.nivelAgua < 3 || this.nivelShampoo < 1) {
            System.out.println("Sem agua ou shampoo suficiente!");
            Status();
            return;
            }
        this.nivelAgua -= 3;
        this.nivelShampoo -= 1;  
        this.maquinaLimpa = true;
        System.out.println("A maquina esta limpa!");
    }

}
