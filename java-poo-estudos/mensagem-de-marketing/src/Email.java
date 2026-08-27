public class Email implements Marketing {

    @Override
    public void mensagem(String mens){
        System.out.println("De Email: " + mens);
    }
}

