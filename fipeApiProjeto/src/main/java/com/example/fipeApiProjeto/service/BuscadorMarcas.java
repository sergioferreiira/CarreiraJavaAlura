package com.example.fipeApiProjeto.service;

import com.example.fipeApiProjeto.models.FipeVeiculo;
import com.example.fipeApiProjeto.models.Marca;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

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

    public void buscandoModelos(String tipo , String modelo) throws JsonProcessingException {

        List<Marca> marcasBuscadas = buscandoMarcas(tipo);

        System.out.println("aqui sao as marcas buscadas ***********************");

        System.out.println(marcasBuscadas);


    }

//    public void buscandoAnos(String tipo , String modelo, String anos) throws JsonProcessingException {
//
//        String buscandoAnos = buscaVeiculo.BuscaMarcas(buscaVeiculo.urlBusca  + tipo + "/marcas/"+ modelo + "/modelos/" + anos + "/anos");
//
//        List<Marca> verificaAnos = map.readValue(
//                prettyJsonModelos,
//                new TypeReference<List<Marca>>() {}
//        );
//
//        String numeroModeloAno = streamFilter.codFilter(verificaAnos , modeloVerificacao);
//
//
//        List<Marca> x = map.readValue(
//                buscandoAnos,
//                new TypeReference<List<Marca>>() {}
//        );
//
//        String anosPretty = map.writerWithDefaultPrettyPrinter().writeValueAsString(x);
//
//        System.out.println(anosPretty);
//
//        System.out.println("Escolha o ano que deseja ver o valor da FIPE: ");
//
//        var anoDigitado = scan.nextLine().toUpperCase();
//
//        String codigoAnoDigitado = streamFilter.codFilter(x , anoDigitado);
//
//        String valorFipe = buscaVeiculo.BuscaMarcas(buscaVeiculo.urlBusca + escolhaTipo + "/marcas/"+ marcaEscolhida + "/modelos/" + numeroModeloAno + "/anos/" + codigoAnoDigitado);
//
//
//        var result = map.readValue(valorFipe , FipeVeiculo.class);
//
//        System.out.println(result);
//
//    }
}
