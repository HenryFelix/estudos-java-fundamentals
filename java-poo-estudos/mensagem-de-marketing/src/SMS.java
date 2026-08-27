public class SMS implements Marketing {

    @Override
    public void mensagem(String mens){
        System.out.println("De SMS: " + mens);
    }
}

