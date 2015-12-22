package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;

@Service("personService")
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	public Person create(Person person){
		return personRepository.save(person);
	}
}
