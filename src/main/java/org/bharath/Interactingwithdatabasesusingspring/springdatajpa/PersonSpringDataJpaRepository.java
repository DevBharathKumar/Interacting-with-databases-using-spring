package org.bharath.Interactingwithdatabasesusingspring.springdatajpa;

import org.bharath.Interactingwithdatabasesusingspring.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataJpaRepository extends JpaRepository<Person, Integer>{

}
