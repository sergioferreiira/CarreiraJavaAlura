import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Digite seu nome");
        String respostaNome = scanner.nextLine();
        System.out.println("Digite sua idade");
        int respostaIdade = scanner.nextInt();
        System.out.println("Digite seu endereco");

        scanner.nextLine();

        String respostaEndereco = scanner.nextLine();
        System.out.println("Digite seu numero de endereço");
        int respostaNumeroCasa = scanner.nextInt();

        perguntarConferir(respostaNome,respostaIdade,respostaEndereco,respostaNumeroCasa);
        }

    public static void perguntarConferir(String nome, int idade, String endereco, int numero) {


        System.out.printf("""
                Olá %s ,
                 sua idade e de %d anos.
                 seu endereço é %s numero %d

                """, nome, idade,endereco,numero);

    }

    }



