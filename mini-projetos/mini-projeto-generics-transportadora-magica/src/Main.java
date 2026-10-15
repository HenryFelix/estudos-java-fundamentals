import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Caixa<Produto>> caminhao = new ArrayList<>();

        caminhao.add(new Caixa<>(new Produto("Teclado", new BigDecimal("150.0"))));
        caminhao.add(new Caixa<>(new Produto("Mouse", new BigDecimal("200.0"))));
        caminhao.add(new Caixa<>(new Produto("Monitor", new BigDecimal("600.0"))));
        caminhao.add(new Caixa<>(new Produto("Headset", new BigDecimal("80.0"))));
        caminhao.add(new Caixa<>(new Produto("MousePad", new BigDecimal("50.0"))));

        Caixa<Integer> caixaInt = new Caixa<>(100);
//        caminhao.add(caixaInt); nao compila: Caixa nao pode converter para Caixa<Produto>

        BigDecimal limite = new BigDecimal("100");

        caminhao.stream()
                .map(Caixa::getConteudo)
                .filter(produto -> produto.getPreco().compareTo(limite) > 0)
                .forEach(System.out::println);
        
    }
}