import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Compra {
    public static void main(String[] args) {

        List<String> listaTeste = new ArrayList<>();

        BigDecimal x = new BigDecimal("100.0");
        listaTeste.add("tulipa"+ " "+ x);

        System.out.println(listaTeste);

    }
}