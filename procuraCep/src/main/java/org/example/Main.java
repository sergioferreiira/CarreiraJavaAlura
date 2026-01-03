package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();



        Scanner scan = new Scanner(System.in);

        String busca = "";

        while(!busca.equalsIgnoreCase("sair") ){
            System.out.println("digite o cep que deseja procurar: ");
            busca = scan.nextLine();

            if (busca == "sair"){
                break;
            }else{
                ApiViaCep buscandoCepApi = new ApiViaCep(busca);
                var result = buscandoCepApi.buscaCep();
                Cep cep = CepMapper.fromJson(result);
                System.out.println(cep.cep());

            }
        }
    }
}