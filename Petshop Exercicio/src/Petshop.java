public class Petshop {
    private int nivelAgua;
    private int nivelShampoo;
    private int petQuantidade;
    private boolean petLimpo;
    private boolean maquinaLimpa;
    private Pet pet;

    public Petshop() {
        this.nivelAgua = 0;
        this.nivelShampoo = 0;
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
        this.petLimpo = true;
        System.out.println("Banho concluido");
        this.nivelAgua -= 10;
        this.nivelShampoo -= 2;
    }

    public void abastecer(int valorAgua, int valorShamp) {
        if (valorAgua > 2 || nivelShampoo > 2) {
            System.out.println("Sao permitidos 2 litros por vez");
            return;
        }
        if (this.nivelAgua + valorAgua >= 30 || this.nivelShampoo + valorShamp >= 10) {
            System.out.println("Nivel maximo de capacidade de agua ou shampoo");
            return;
        }
        this.nivelAgua += valorAgua;
        this.nivelShampoo += valorShamp;
        System.out.println("Nivel da agua: " + nivelAgua + " | Nivle do shampoo: " + nivelShampoo);
    }

    public void Status () {
        System.out.println("Nivel da agua: " + nivelAgua + " | Nivle do shampoo: " + nivelShampoo + " | Pets: " + petQuantidade);
    }

    public void colocarPet (Pet novoPet) {
        this.pet = novoPet;
    } 

    public void tirarPet (){
        if (this.petQuantidade == 0) {
            System.out.println("Nao ha nenhum pet na maquina");
            return;
        } else if (this.petLimpo == false) {
            this.maquinaLimpa = false;
            System.out.println("O pet saiu sujo. Limpe a maquina.");
            return;
        }
        System.out.println("O pet " + this.pet.getName() + " esta limpo");
        this.petQuantidade = 0;

    }

    public void limparMaquina() {
        if (this.maquinaLimpa == true) {
            System.out.println("A maquina ja esta limpa!");
            return;
        }
        this.nivelAgua -= 3;
        this.nivelShampoo -= 1;  
        this.maquinaLimpa = true;
        System.out.println("A maquina esta limpa!");
    }

}
