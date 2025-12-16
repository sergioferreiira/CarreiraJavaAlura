import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);

        int chances = 5;

        while (chances > 0){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Qual é o numero secreto? ");
            int resposta = scanner.nextInt();

            if (resposta > numeroAleatorio){
                System.out.println("Voce está acima do numero secreto");
            } else if(resposta == numeroAleatorio){
                System.out.printf("""
                        Voce acertou o numero aleatorio parabens
                        E ainda sobraram %d chances
                        """, chances);
                System.out.println();
            }else {
                System.out.println("Voce está a baixo do numero secreto");
            }

            chances--;

            if (chances == 0){
                System.out.println("suas chances acabaram!");
                System.out.println(numeroAleatorio);
            }else {
                System.out.printf("Ainda restam %d chances", chances);
            }
        }
    }
}
