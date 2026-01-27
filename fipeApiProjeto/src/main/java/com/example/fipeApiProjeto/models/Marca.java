package com.example.fipeApiProjeto.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Marca(@JsonAlias("codigo") String cod ,
                    @JsonAlias("nome") String descricao) {
    @Override
    public String toString() {
        return  " Cód : " + cod +
                " descricao : " + descricao + "\n";
    }

}
