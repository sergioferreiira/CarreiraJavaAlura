import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class Ombd {
    private String apiKey = "441ef56";
    private static final String BASE_URL = "http://www.omdbapi.com/";
    private String nomeFilme;
    private static final HttpClient CLIENT = HttpClient.newHttpClient();


    public Ombd(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getUrl() throws IOException, InterruptedException {

        String encodedMovie = URLEncoder.encode(nomeFilme, StandardCharsets.UTF_8);

        String fullUrl = String.format(
                "%s?apikey=%s&t=%s",
                BASE_URL,
                apiKey,
                encodedMovie
        );

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(fullUrl))
                .build();

        HttpResponse<String> response = CLIENT
                .send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}


