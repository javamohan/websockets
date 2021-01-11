package com.example.WebsocketFilims;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface FilimsRepository extends MongoRepository<FilimModal, String> {
	
}

	
	

