package org.bharath.Interactingwithdatabasesusingspring.jdbc;

import java.util.List;

import org.bharath.Interactingwithdatabasesusingspring.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonJdbcDao 
{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Person> findAllPersons()
	{
		return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));
	}
}
