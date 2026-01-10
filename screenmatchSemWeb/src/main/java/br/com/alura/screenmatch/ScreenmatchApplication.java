package br.com.alura.screenmatch;

import br.com.alura.screenmatch.models.DadosSeries;
import br.com.alura.screenmatch.services.ConsumoApi;
import br.com.alura.screenmatch.services.ConverteDados;
import br.com.alura.screenmatch.services.IConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        ConsumoApi consumoApi = new ConsumoApi();
        var json = consumoApi.ObterDados("http://www.omdbapi.com/?apikey=a443fbd7&t=the+good+doctor");

        ConverteDados converter = new ConverteDados();
        System.out.println(converter.obterDados(json, DadosSeries.class));

    }
}
