import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cartao {
    private BigDecimal fatura;
    private BigDecimal limite;
    private BigDecimal saldoCartao;

    List<String> listaCompras = new ArrayList<>();


    public Cartao(BigDecimal limite, BigDecimal fatura) {
        this.fatura = fatura;
        this.limite = limite;

    }

    public BigDecimal getSaldoCartao() {
        return limite.subtract(fatura);
    }

    public BigDecimal getFatura() {
        return fatura;
    }

    public void adicionaFatura(BigDecimal fatura) {
        this.fatura = this.fatura.add(fatura);
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }

    public void validaCompra(BigDecimal valorCompra , String descricao){
        if (getFatura().add(valorCompra).compareTo(getLimite()) <= 0){
            adicionaFatura(valorCompra);
            listaCompras.add(descricao + " - " + valorCompra);

            System.out.println("Compra Realizada \n");
        }else {
            System.out.println("O valor dessa compra é maior que o limite do seu cartao!!!");
            System.out.println("Seu limite é : " + getLimite());
        }
    }

    public void printFatura(){
        System.out.println("**********FATURA**********");
        for(String compra : listaCompras){
            System.out.println(compra);
        }
        System.out.println("**************************");
        System.out.println("Saldo cartão : " + getSaldoCartao());
    }


}
