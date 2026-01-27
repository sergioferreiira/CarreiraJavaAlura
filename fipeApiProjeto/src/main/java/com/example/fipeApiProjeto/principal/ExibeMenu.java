package com.example.fipeApiProjeto.principal;


import com.example.fipeApiProjeto.models.Marca;
import com.example.fipeApiProjeto.service.ApiFipe;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ExibeMenu {
    private String urlBusca = "https://parallelum.com.br/fipe/api/v1/";
    ObjectMapper map = new ObjectMapper();
    Scanner scan = new Scanner(System.in);

    public void menu () throws JsonProcessingException {
        ApiFipe buscaVeiculo = new ApiFipe();

        System.out.println("****************** " +
                "\n Escolha entre : " +
                "\n CARROS " +
                "\n MOTOS " +
                "\n CAMINHOES " +
                "\n ****************** " +
                "\n");

        String escolhaTipo = scan.nextLine().toLowerCase();

        String buscando = buscaVeiculo.BuscaMarcas(urlBusca + escolhaTipo + "/marcas");

        JsonNode rootMarcas = map.readTree(buscando);
        String prettyJsonMarcas = map.writerWithDefaultPrettyPrinter()
                .writeValueAsString(rootMarcas);

        List<Marca> marcaRecord = map.readValue(
                prettyJsonMarcas,
                new TypeReference<List<Marca>>() {}
        );

        System.out.println(marcaRecord);


        System.out.println("Escolha o codigo ou nome da marca");

        var codigoNomeMarca = scan.nextLine().toUpperCase();

        var x = marcaRecord.stream().filter(
                m -> m.descricao().equalsIgnoreCase(codigoNomeMarca) ||
                m.cod().equalsIgnoreCase(codigoNomeMarca))
                .map(Marca::cod)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Marca não encontrada"));





        String buscandoModelos = buscaVeiculo.BuscaMarcas(urlBusca + escolhaTipo + "/marcas" + "/"+ x + "/"+"modelos");

        JsonNode rootModelos = map.readTree(buscandoModelos);
        JsonNode modelosNode = rootModelos.path("modelos");
        String prettyJsonModelos = map.writerWithDefaultPrettyPrinter()
                .writeValueAsString(modelosNode);


        System.out.println(prettyJsonModelos);

}
}
