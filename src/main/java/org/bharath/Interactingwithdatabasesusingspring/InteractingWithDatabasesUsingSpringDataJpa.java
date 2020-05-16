package org.bharath.Interactingwithdatabasesusingspring;


import java.util.Date;

import org.bharath.Interactingwithdatabasesusingspring.entity.Person;
import org.bharath.Interactingwithdatabasesusingspring.jpa.PersonJpaRepository;
import org.bharath.Interactingwithdatabasesusingspring.springdatajpa.PersonSpringDataJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InteractingWithDatabasesUsingSpringDataJpa implements CommandLineRunner{

	@Autowired
	PersonSpringDataJpaRepository repository;
	
	Logger logger = LoggerFactory.getLogger(InteractingWithDatabasesUsingSpringDataJpa.class);
	
	public static void main(String[] args) {
		SpringApplication.run(InteractingWithDatabasesUsingSpringDataJpa.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("Getting details of a single person -> {} ",repository.findById(10003));
		
		logger.info("Inserting one person -> {} ",
				repository.save(new Person("Abi", "Vandalur", new Date())));
		
		logger.info("Updating user 10003 -> {} ",
				repository.save(new Person(10003,"Abdul","Zamin Pallavaram",new Date())));

		repository.deleteById(10002);
		
		logger.info("All persons details -> {} ",repository.findAll());
		
	}

}
