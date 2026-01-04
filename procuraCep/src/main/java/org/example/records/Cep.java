package org.example.records;

public record Cep(
        String cep,
        String logradouro,
        String complemento,
        String unidade,
        String bairro,
        String localidade,
        String uf,
        String estado,
        String regiao,
        String ibge,
        String gia,
        String ddd,
        String siafi
){


    @Override
    public String toString() {
        return  "cep =" + cep + "\n" +
                "logradouro = " + logradouro + "\n" +
                "bairro = " + bairro + "\n" +
                "localidade = " + localidade + "\n" +
                "estado = " + estado + "\n" +
                "ddd = " + ddd;
    }
}
