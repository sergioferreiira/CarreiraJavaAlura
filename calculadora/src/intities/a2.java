package intities;
import java.util.List;
import java.util.stream.Collectors;

public class a2 {

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numerosPares = numeros.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Números pares (função lambda): " + numerosPares);
    }
}
0