package com.example.fipeApiProjeto.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true)
public record FipeVeiculo(String Marca, String Modelo, String AnoModelo ,String CodigoFipe , String MesReferencia, String Valor) {

    @Override
    public String toString() {
        return
                "Marca = " + Marca + "\n" +
                "Modelo = " + Modelo + "\n" +
                "AnoModelo = " + AnoModelo + "\n" +
                "Codigo Fipe = " + CodigoFipe + "\n" +
                "Mes De Referencia = " + MesReferencia + "\n" +
                "Valor = " + Valor;
    }
}
