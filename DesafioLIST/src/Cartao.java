

public class Cartao {
    private float fatura;
    private float limite;
    private String descricaoProduto;
    private int produtoPreco;

    public Cartao(float fatura, float limite) {
        this.fatura = fatura;
        this.limite = limite;

    }

    public float getFatura() {
        return fatura;
    }

    public void setFatura(float fatura) {
        this.fatura = fatura;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public String getDescricaoProduto() {
        return descricaoProduto + " " + produtoPreco;
    }

    public void setDescricao(String descricao , int preco) {
        this.descricaoProduto = descricao;
        this.produtoPreco = preco;
    }
}
