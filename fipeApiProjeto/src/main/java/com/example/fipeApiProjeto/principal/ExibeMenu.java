package com.example.fipeApiProjeto.principal;

import com.example.fipeApiProjeto.service.BuscadorMarcas;
import com.example.fipeApiProjeto.service.StreamFilter;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.util.Scanner;

public class ExibeMenu {
    BuscadorMarcas marcas = new BuscadorMarcas();
    Scanner scan = new Scanner(System.in);
    StreamFilter streamFilter = new StreamFilter();

    public void menu () throws IOException {

        System.out.println("****************** " +
                "\n Escolha entre : " +
                "\n CARROS " +
                "\n MOTOS " +
                "\n CAMINHOES " +
                "\n ****************** " +
                "\n");

        String escolhaTipo = scan.nextLine().toLowerCase();

        System.out.println(marcas.buscandoMarcas(escolhaTipo));

        System.out.println("Escolha o modelo: \n");

        var escolhaModelo = scan.nextLine().toUpperCase();

        marcas.buscandoModelos(escolhaTipo, escolhaModelo);

        System.out.println("Escolha o modelo para verificar os anos:");

        var escolhaAno = scan.nextLine().toUpperCase();

        marcas.buscandoAnos(escolhaTipo, escolhaModelo,escolhaAno);


    }
}
