import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class googleBooksAPI {
    private static final String BASE_URL = "https://www.googleapis.com";
    private static final HttpClient CLIENT = HttpClient.newHttpClient();
    private String nomeLivro;

    public googleBooksAPI(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getDadosLivro() throws IOException, InterruptedException {

        String encodedURL = URLEncoder.encode( nomeLivro ,StandardCharsets.UTF_8);

        String fullUrl = String.format(
                "%s/books/v1/volumes?q=%s",
                BASE_URL,
                encodedURL);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(fullUrl))
                .build();

        HttpResponse<String> response = CLIENT.send(request , HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}

