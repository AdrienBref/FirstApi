package com.bref.apimongo.repository;

import org.springframework.stereotype.Repository;
import com.bref.apimongo.model.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface PersonaRepository extends MongoRepository<Persona, String>{
	
}
