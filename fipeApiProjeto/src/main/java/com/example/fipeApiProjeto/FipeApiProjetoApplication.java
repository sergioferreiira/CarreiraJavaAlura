package com.example.fipeApiProjeto;

import com.example.fipeApiProjeto.principal.ExibeMenu;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URI;

@SpringBootApplication
public class FipeApiProjetoApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(FipeApiProjetoApplication.class, args);

        ExibeMenu x = new ExibeMenu();

        x.menu();




	}
}
