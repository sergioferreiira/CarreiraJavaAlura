package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.models.DadosSeries;
import br.com.alura.screenmatch.models.DadosTemporada;
import br.com.alura.screenmatch.services.ConsumoApi;
import br.com.alura.screenmatch.services.ConverteDados;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Principal {
    private final Scanner scanner = new Scanner(System.in);
    private final String API_KEY = "a443fbd7&t=";
    private final String URL_OMDB = "http://www.omdbapi.com/?apikey=";
    private final ConsumoApi consumoApi = new ConsumoApi();
    private final ConverteDados conversor = new ConverteDados();




    public void exibirMenu(){
        System.out.println("Digite o nome da serie : ");
        var serieNome = URLEncoder.encode(scanner.nextLine(), StandardCharsets.UTF_8);

        try {
            var dados = consumoApi.ObterDados(URL_OMDB + API_KEY + serieNome );
            var result = conversor.obterDados(dados, DadosSeries.class);
            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void exibeTodasTemporadas() {
        System.out.println("Digite a se quer ver todas as temporadas dessa serie:");
        var serieNome = URLEncoder.encode(scanner.nextLine(), StandardCharsets.UTF_8);

        try {
            var dados = consumoApi.ObterDados(URL_OMDB + API_KEY + serieNome);
            var result = conversor.obterDados(dados, DadosTemporada.class);
            var parseResult = Integer.parseInt(result.totalTemporadas());

            for(int i = 1; i <= parseResult; i++){
                var dados1 = consumoApi.ObterDados(URL_OMDB + API_KEY + serieNome +"&season=" + i);
                var result1 = conversor.obterDados(dados1, DadosTemporada.class);
                System.out.println(result1);
            }

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
