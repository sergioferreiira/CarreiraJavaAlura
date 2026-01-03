package org.example;


import java.io.IOException;
import java.net.URI;

import java.net.http.HttpClient;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ApiViaCep {
    private String cep;
    private static final HttpClient CLIENT = HttpClient.newHttpClient();
    private static final String BASE_URL = "https://viacep.com.br/ws/";

    public ApiViaCep(String cep) {
        this.cep = cep;
    }

    public String buscaCep() throws IOException, InterruptedException {


        String fullUrl = String.format(
                "%s/%s/json/",
                BASE_URL,
                cep);


        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(fullUrl))
                .build();
        
        HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }


    
}
