import java.util.HashMap;
import java.util.Map;

public class Filmes {

    private static Map<String, Filmes> listaFilmes = new HashMap<>();

    // 2. Atributos (características) da classe
    private String nome;
    private int ano;
    private boolean inclusoPlano;

    // 3. Construtor (método especial para inicializar o objeto)
    public Filmes(String nome, int ano, boolean inclusoPlano) {
        this.nome = nome;
        this.ano = ano;
        this.inclusoPlano = inclusoPlano;

        listaFilmes.put(nome , this);
    }

    public String getNome() {
        return nome;
    }

    public static Map<String , Filmes> getFilmes() {
        return listaFilmes;
    }

    @Override
    public String toString() {
        return nome + " - " + ano + " (incluído no plano: " + inclusoPlano + ")";
    }
}
