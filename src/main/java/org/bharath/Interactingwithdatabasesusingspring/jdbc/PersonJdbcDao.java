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
	
	public Person findPersonById(int id)
	{
		return jdbcTemplate.queryForObject("select * from person where id = ?",new Object[] {id},
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public int deletePersonById(int id)
	{
		return jdbcTemplate.update("delete from person where id = ?",new Object [] {id});
	}
}
