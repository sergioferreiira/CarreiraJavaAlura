package intities;
import java.util.ArrayList;
import java.util.List;

public class a1 {

    // Função normal para filtrar números pares
    public List<Integer> filtrarNumerosPares(List<Integer> numeros) {
        List<Integer> numerosPares = new ArrayList<>();
        for (Integer num : numeros) {
            if (num % 2 == 0) {
                numerosPares.add(num);
            }
        }
        return numerosPares;
    }
    public static void main(String[] args) {
        a1 exemplo = new a1();
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numerosPares = exemplo.filtrarNumerosPares(numeros);
        System.out.println("Números pares (função normal): " + numerosPares);
    }
}
