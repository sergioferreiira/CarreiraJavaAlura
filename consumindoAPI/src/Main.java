import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do filme que deseja receber as informações: ");
        var scanFilme  = scan.nextLine();

        Ombd filme1 = new Ombd(scanFilme);



        System.out.println(filme1.getUrl());


    }
}