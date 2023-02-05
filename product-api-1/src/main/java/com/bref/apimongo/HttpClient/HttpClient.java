package com.bref.apimongo.HttpClient;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.bref.apimongo.model.Persona;

public class HttpClient {

	  private static final String API_BASE_URL = "http://localhost:8080/api/v1/personas";

	  public static void postPersona(Persona persona) {
	    RestTemplate restTemplate = new RestTemplate();
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    HttpEntity<Persona> request = new HttpEntity<>(persona, headers);
	    restTemplate.postForObject(API_BASE_URL, request, Void.class);
	  }
}
