package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Funcionalidades.ApiViaCep;
import org.example.Funcionalidades.ListaDeProcura;
import org.example.records.Cep;

import java.io.File;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        ListaDeProcura pesquisasFeitas = new ListaDeProcura();
        ObjectMapper mapper = new ObjectMapper();

        Scanner scan = new Scanner(System.in);
        String busca = "";
        while(!busca.equalsIgnoreCase("sair") ){

            System.out.println("digite o cep que deseja procurar: ");
            busca = scan.nextLine();

            if (Objects.equals(busca, "sair")){
                mapper
                        .writerWithDefaultPrettyPrinter()
                        .writeValue(
                                new File("ceps.json"),
                                pesquisasFeitas.exibeLista()
                        );
                break;
            }else{
                ApiViaCep buscandoCepApi = new ApiViaCep(busca);
                var result = buscandoCepApi.buscaCep();
                Cep cep = mapper.readValue(result, Cep.class);

                pesquisasFeitas.adicionaLista(cep);

            }
        }
    }
}