package br.com.alura.Exercicios;

public class Veiculo {
    private String nome;
    private String modelo;
    private int anoVeiculo;
    private double preco;


    public Veiculo(String nome, String modelo, int anoVeiculo, double preco) {
        this.nome = nome;
        this.modelo = modelo;
        this.anoVeiculo = anoVeiculo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoVeiculo() {
        return anoVeiculo;
    }

    public void setAnoVeiculo(int anoVeiculo) {
        this.anoVeiculo = anoVeiculo;
    }

    public double isPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoVeiculo=" + anoVeiculo +
                ", preco=" + preco + " ";
    }
}
