package com.bref.apimongo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bref.apimongo.HttpClient.HttpClient;
import com.bref.apimongo.model.Persona;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

@SpringBootApplication
public class ProductApi1Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ProductApi1Application.class, args);
		
		Scanner scanner = new Scanner(System.in);
		String nombre;
		
		System.out.println("Introduzca parametro");
		nombre = scanner.next();
		String json = "{\"nombre\":\"Adrian\",\"edad\":30}";
	    ObjectMapper mapper = new ObjectMapper();
	    Persona persona = mapper.readValue(json, Persona.class);
	    HttpClient.postPersona(persona);
		
	}

}
