package com.example.demo.bean;

import javax.faces.bean.ManagedBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;

@ManagedBean(name="personBean")
public class PersonBean {

	private Person person = new Person();

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public void create(){
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonService service = (PersonService) context.getBean("personService");
		
		service.create(person);
		
		context.close();
		
	}
	
}
