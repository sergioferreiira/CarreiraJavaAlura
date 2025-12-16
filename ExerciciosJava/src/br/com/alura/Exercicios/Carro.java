package br.com.alura.Exercicios;

public class Carro extends Veiculo {
    private String portas;
    private String tipoDeCambio;


    public Carro(String nome, String modelo, int anoVeiculo, double preco, String portas, String tipoDeCambio) {
        super(nome, modelo, anoVeiculo, preco);
        this.portas = portas;
        this.tipoDeCambio = tipoDeCambio;
    }

    public String getPortas() {
        return portas;
    }

    public void setPortas(String portas) {
        this.portas = portas;
    }

    public String getTipoDeCambio() {
        return tipoDeCambio;
    }

    public void setTipoDeCambio(String tipoDeCambio) {
        this.tipoDeCambio = tipoDeCambio;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "tipoDeCambio='" + tipoDeCambio + '\'' +
                ", portas='" + portas + '\'';
    }
}
