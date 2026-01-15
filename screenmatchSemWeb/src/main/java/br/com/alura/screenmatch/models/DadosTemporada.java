package br.com.alura.screenmatch.models;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosTemporada(@JsonAlias("Season") String Temporada,
                             @JsonAlias("totalSeasons") String totalTemporadas,
                             @JsonAlias("Episodes") List<Object> Episodios) {
}
