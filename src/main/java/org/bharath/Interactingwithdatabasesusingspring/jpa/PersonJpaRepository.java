package org.bharath.Interactingwithdatabasesusingspring.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.bharath.Interactingwithdatabasesusingspring.entity.Person;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class PersonJpaRepository 
{
	@PersistenceContext
	EntityManager entityManager;
	
	public Person findPersonById(int id)
	{
		return entityManager.find(Person.class, id);
	}
	
	public Person insertPerson(Person person)
	{
		return entityManager.merge(person);
	}
	
	public Person updatePerson(Person person)
	{
		return entityManager.merge(person);
	}
}
