import br.com.alura.Exercicios.Carro;
import br.com.alura.Exercicios.CatalogoVeiculos;
import br.com.alura.Exercicios.Veiculo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro camaro = new Carro("Camaro", "Esportivo",2000, 199.000 ,"4 portas" , "Manual");

        CatalogoVeiculos carros = new CatalogoVeiculos();
        carros.adicionarCarro(camaro.getNome() , camaro);

        System.out.println(carros.buscarCarro("Camaro"));
    }
}