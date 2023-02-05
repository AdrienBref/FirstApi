package com.bref.apimongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bref.apimongo.model.Persona;
import com.bref.apimongo.repository.PersonaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonaService {
	
	private final PersonaRepository personaRepository;
	
	public PersonaService(PersonaRepository personaRepository) {
		this.personaRepository = personaRepository;
	}
	
	public void save(Persona persona) {
		personaRepository.save(persona);
	}
	
	public List<Persona> findAll() {
		return personaRepository.findAll();
	}
	public Optional<Persona> findById(String id) {
		return personaRepository.findById(id);
	}
	public void deleteById(String id) {
		personaRepository.deleteById(id);
	}
}
