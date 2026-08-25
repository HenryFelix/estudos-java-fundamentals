public class Pet {
    private final String name;
    private boolean petLimpo;

    public Pet(String name) {
        this.name = name;
        this.petLimpo = false;
    }

    public String getName() {
        return name;
    
    }

    public boolean isPetLimpo() {
        return petLimpo;
    }

    public void setpetLimpo(boolean petLimpo) {
        this.petLimpo = petLimpo;
    }
}
