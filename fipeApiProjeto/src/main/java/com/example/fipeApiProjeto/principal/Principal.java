package com.example.fipeApiProjeto.principal;

import com.example.fipeApiProjeto.models.Modelo;
import com.example.fipeApiProjeto.service.ApiFipe;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Scanner;

public class Principal {
    private String urlBusca = "https://parallelum.com.br/fipe/api/v1/";
    ObjectMapper map = new ObjectMapper();
    Scanner scan = new Scanner(System.in);

    public void pesquisaFipe () throws JsonProcessingException {
        ApiFipe buscaVeiculo = new ApiFipe();

        System.out.println("****************** " +
                "\n Escolha entre : " +
                "\n CARROS " +
                "\n MOTOS " +
                "\n CAMINHOES " +
                "\n ****************** " +
                "\n");

        String escolhaTipo = scan.nextLine().toLowerCase();

        String buscando = buscaVeiculo.BuscaMarcas(urlBusca+escolhaTipo + "/marcas");

        List<Modelo> tiposModelos = map.readValue(
                buscando,
                new TypeReference<List<Modelo>>() {}
        );

        System.out.println(tiposModelos.stream().findFirst());

    }
}
