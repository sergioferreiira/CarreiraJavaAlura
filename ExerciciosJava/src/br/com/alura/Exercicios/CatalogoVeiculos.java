package br.com.alura.Exercicios;

import java.util.HashMap;
import java.util.Map;

public class CatalogoVeiculos {

    Map<String , Carro> catalogo = new HashMap<>();

    public void adicionarCarro(String nome, Carro carro) {
        catalogo.put(nome, carro);
    }

    public Carro buscarCarro(String id) {
        return catalogo.get(id);
    }


    public void listarCatalogo() {

    }
}
