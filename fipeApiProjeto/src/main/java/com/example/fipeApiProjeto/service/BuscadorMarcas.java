package com.example.fipeApiProjeto.service;

import com.example.fipeApiProjeto.models.FipeVeiculo;
import com.example.fipeApiProjeto.models.Marca;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BuscadorMarcas {
    ApiFipe buscaVeiculo = new ApiFipe();
    ObjectMapper map = new ObjectMapper();


    public List<Marca> buscandoMarcas(String tipo) throws JsonProcessingException {

        String buscando = buscaVeiculo.BuscaMarcas(buscaVeiculo.urlBusca + tipo + "/marcas");

        JsonNode rootMarcas = map.readTree(buscando);
        String prettyJsonMarcas = map.writerWithDefaultPrettyPrinter()
                .writeValueAsString(rootMarcas);

        List<Marca> marcaRecord = map.readValue(
                prettyJsonMarcas,
                new TypeReference<List<Marca>>() {}
        );

        return marcaRecord.stream()
                .map(m -> new Marca( m.cod() , m.descricao()))
                .collect(Collectors.toList());

    }

    public List<Marca> buscandoModelos(String tipo , String modelo) throws IOException {

        List<Marca> marcasBuscadas = buscandoMarcas(tipo);


        String numeroModelo = marcasBuscadas.stream()
                .filter(m -> m.cod().equalsIgnoreCase(modelo) ||
                        m.descricao().equalsIgnoreCase(modelo))
                .map(Marca::cod)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("not founded"));

        String buscando = buscaVeiculo.BuscaMarcas(buscaVeiculo.urlBusca + tipo + "/marcas/" + numeroModelo + "/modelos" );

        JsonNode root = map.readTree(buscando);
        JsonNode modelosNode = root.path("modelos");

        List<Marca> result = map
                .readerForListOf(Marca.class)
                .readValue(modelosNode);

        System.out.println("Resultado:");
        result.forEach(m ->
                System.out.println("Código: " + m.cod() + " | Nome: " + m.descricao())
        );
        return result;


    }

    public List<Marca> buscandoAnos(String tipo , String modelo, String anos) throws IOException {

        List<Marca> marcasBuscadas = buscandoModelos(tipo, modelo);

        String anoEscolhido = marcasBuscadas.stream()
                .filter(m -> m.cod().equalsIgnoreCase(anos) ||
                        m.descricao().equalsIgnoreCase(anos))
                .map(Marca::cod)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("not founded"));

        String buscando = buscaVeiculo.BuscaMarcas(buscaVeiculo.urlBusca + tipo + "/marcas/" + modelo + "/modelos/" + anoEscolhido + "/anos" );

        JsonNode result = map.readTree(buscando);

        List<Marca> listagemAnos = map.readerForListOf(Marca.class).readValue(buscando);

        listagemAnos.forEach(m -> System.out.println("Código: " + m.cod() + "|" + "Ano:" + m.descricao()));

        return listagemAnos;
    }
}
