package org.bharath.Interactingwithdatabasesusingspring;

import org.bharath.Interactingwithdatabasesusingspring.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InteractingWithDatabasesUsingSpringJpa implements CommandLineRunner{

	@Autowired
	PersonJpaRepository repository;
	
	Logger logger = LoggerFactory.getLogger(InteractingWithDatabasesUsingSpringJpa.class);
	
	public static void main(String[] args) {
		SpringApplication.run(InteractingWithDatabasesUsingSpringJpa.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("Getting details of a single person -> {} ",repository.findPersonById(10003));

		/*logger.info("All persons details -> {} ",personDao.findAllPersons());
		
		logger.info("No of person affected by the delete -> {} ",personDao.deletePersonById(10002));
		
		logger.info("Inserting one person -> {} ",
				personDao.insertPerson(new Person(10004, "Abi", "Vandalur", new Date())));
		
		logger.info("Updating user 10003 -> {} ",
				personDao.updatePerson(new Person(10003,"Abdul","Zamin Pallavaram",new Date())));*/
	}

}