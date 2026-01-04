package org.example.Funcionalidades;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.records.Cep;


import java.util.ArrayList;
import java.util.List;

public class ListaDeProcura {

    private final List<Cep> listaPesquisada = new ArrayList<>();

    public void adicionaLista(Cep cep){
        if(listaPesquisada.contains(cep)){
            System.out.println("Esse cep já foi foi pesquisado!");
        }else {
            this.listaPesquisada.add(cep);
        }

    }

    public List<Cep> exibeLista(){
        return listaPesquisada;
    }


    @Override
    public String toString() {
        return  "listaPesquisada=" + listaPesquisada ;
    }
}
