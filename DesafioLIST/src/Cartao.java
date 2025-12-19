import java.math.BigDecimal;


public class Cartao {
    private BigDecimal fatura;
    private BigDecimal limite;
    private BigDecimal saldoCartao;


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


}
