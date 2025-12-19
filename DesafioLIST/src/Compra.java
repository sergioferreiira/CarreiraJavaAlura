import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<String> listaCompras = new ArrayList<>();

    public void validaCompra(Cartao cartao, BigDecimal valorCompra, String descricao){
        if (cartao.getFatura().add(valorCompra).compareTo(cartao.getLimite()) <= 0){
            cartao.adicionaFatura(valorCompra);

            listaCompras.add(descricao + " - " + valorCompra);

            System.out.println("Compra Realizada \n");
        }else {
            System.out.println("O valor dessa compra é maior que o limite do seu cartao!!!");
            System.out.println("Seu limite é : " + cartao.getLimite());
        }
    }

    public void printCompras(Cartao cartao){
        System.out.println("**********FATURA**********");
        for(String compra : listaCompras){
            System.out.println(compra);
        }
        System.out.println("**************************");
        System.out.println("Saldo cartão : " + cartao.getSaldoCartao());
    }

}