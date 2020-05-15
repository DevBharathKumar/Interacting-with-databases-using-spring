package org.bharath.Interactingwithdatabasesusingspring;

import org.bharath.Interactingwithdatabasesusingspring.jdbc.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InteractingWithDatabasesUsingSpringApplication implements CommandLineRunner{

	@Autowired
	PersonJdbcDao personDao;
	
	Logger logger = LoggerFactory.getLogger(InteractingWithDatabasesUsingSpringApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(InteractingWithDatabasesUsingSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All persons details -> {} ",personDao.findAllPersons());
		logger.info("Getting details of a single person -> {} ",personDao.findPersonById(10001));
		logger.info("No of person affected by the delete -> {} ",personDao.deletePersonById(10002));
	}

}
