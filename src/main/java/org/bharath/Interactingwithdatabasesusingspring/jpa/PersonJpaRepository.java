package org.bharath.Interactingwithdatabasesusingspring.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
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
	
	public void deletePersonById(int id)
	{
		Person person = findPersonById(id);
		entityManager.remove(person);
	}
	
	public List<Person> findAllPersons()
	{
		TypedQuery<Person> result =  entityManager.createNamedQuery("get_all_persons", Person.class);
		return result.getResultList();
	}
	
}
