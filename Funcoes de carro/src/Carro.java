public class Carro {
    private boolean ligado;
    private int velocidade;
    private int marcha;

    public Carro() {
    this.ligado = false;
    this.velocidade = 0;
    this.marcha = 0;
    }

    public void ligar() {
        if (this.marcha != 0) {
            System.out.println("Coloque no neutro para ligar!");
            return;
        }
        this.ligado = true;
    }

    public void desligar(){
        if (this.velocidade == 0 && this.marcha == 0){
            this.ligado = false;
        } else {
            System.out.println("Pare o carro e coloque em ponto morto para desligar o carro!");
        }
    }
    
    public void acelerar (){

        if (this.ligado == false) {
            System.out.println("Ligue o carro");
        } else if (this.marcha == 0) {
            System.out.println("A marcha esta no neutro, nao pode acelerar!");
        } else {
            if (this.marcha != 1 && this.velocidade == 0) {
                this.ligado = false;
                System.out.println("O carro morreu. Engate a primeira para sair. ");
            } else if (this.velocidade <= this.marcha * 20){
                this.velocidade ++;
            } else if (this.velocidade > this.marcha * 20 && this.velocidade <= this.marcha * 20 + 10) {
                this.velocidade ++;
                System.out.println("Troque de marcha para aumentar velocidade"); 
            } else  if (this.velocidade > marcha * 20 + 10) {
                System.out.println("Velocidade maxima para a " + this.marcha + " marcha atingida! Troque de marcha!");
            }
        }
    }

    public void diminuirVelocidade(){
        if (this.ligado == false) {
            System.out.println("Ligue o carro");
        } else {
            if (this.velocidade > 0) {
                this.velocidade--;
            } else {
                System.out.println("A velocidade minima foi atingida!");
            }
        }
    }

    public void trocarMarcha(int novaMarcha) {
        int diferenca = Math.abs (novaMarcha - this.marcha);
        if (novaMarcha > 6 || novaMarcha < 0) {
            System.out.println("Marcha invalida");
        } else if (diferenca == 1) {
            this.marcha = novaMarcha;
        } else if (novaMarcha == this.marcha) {
            System.out.println("Marcha ja engatada.");
        } else {
            System.out.println("Nao e permitido pular marcha");
        }
    }
        public void virarEsquerda() {
            if (this.ligado == false) {
                System.out.println("Ligue o carro");
            } else if (this.velocidade >= 1 && this.velocidade <= 40) {
                System.out.println("Virando a esquerda");
            } else {
                System.out.println("A velocidade para virar deve ser de 1km a 40km");
            }
    }
    public void virarDireita() {
            if (this.ligado == false) {
                System.out.println("Ligue o carro");
            } else if (this.velocidade >= 1 && this.velocidade <= 40) {
                System.out.println("Virando a direita");
            } else {
                System.out.println("A velocidade para virar deve ser de 1km a 40km");
            }
    }

    public void verificarVelocidade() {
        System.out.println("Velocidade Atual: " + this.velocidade);
    }

    public void status() {
        String estado = this.ligado ? "Ligado" : "Desligado";
        System.out.println("Carro: " + estado);
        System.out.println("Marcha: " + this.marcha);
        System.out.println("Velocidade: " + this.velocidade);
    }
}
