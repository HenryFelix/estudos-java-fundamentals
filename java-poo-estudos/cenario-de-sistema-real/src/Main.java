import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> equipe = new ArrayList<>();
        
        equipe.add(new Gerente("Ricardo", "ricardo@gmail.com", 123));
        equipe.add(new Vendedor("Ana", "ana@gmail.com", 456));
        equipe.add(new Atendente("Carlos", "carlos@gmail.com", 789));

        for(Funcionario membro : equipe){
            if (membro instanceof Vendedor){
                Vendedor v = (Vendedor) membro;
                v.realizarVenda();
                System.out.println("Vendas registradas para: " + v.getNome());
            } if (membro instanceof Atendente){
                Atendente a = (Atendente) membro;
                System.out.println("Caixa atual de " + a.getNome() + " | R$: " + a.getCaixa());
            }
        }
        
    }
}
