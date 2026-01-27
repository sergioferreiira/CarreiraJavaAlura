package com.example.fipeApiProjeto.principal;


import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.Scanner;

public class Principal {
    Scanner scan = new Scanner(System.in);
    ExibeMenu exibeMenu = new ExibeMenu();

    public void Programa() throws JsonProcessingException {
        exibeMenu.menu();


    }

}
