package com.example.fipeApiProjeto.service;

import com.example.fipeApiProjeto.models.Marca;

import java.util.List;

public class StreamFilter {
    public String codFilter (List<Marca> lista , String variavel){
        String marcaEscolhida = lista.stream().filter(
                        m -> m.descricao().equalsIgnoreCase(variavel) ||
                                m.cod().equalsIgnoreCase(variavel))
                                    .map(Marca::cod)
                                        .findFirst()
                                            .orElseThrow(() -> new RuntimeException("Marca não encontrada"));

        return marcaEscolhida;

    }
}
