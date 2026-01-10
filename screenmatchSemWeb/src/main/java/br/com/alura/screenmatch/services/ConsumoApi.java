package br.com.alura.screenmatch.services;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {
    private HttpClient  CLIENT = HttpClient.newHttpClient();
    ObjectMapper mapper = new ObjectMapper();


    public String ObterDados(String url) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = CLIENT
                .send(request, HttpResponse.BodyHandlers.ofString());

        String respondeBodyPretty = mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(mapper.readTree(response.body()));



        return respondeBodyPretty;
    }

}
