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
		String contextPath = "applicationContext.xml";
		String servicePath = "personService";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(contextPath);
		PersonService service = (PersonService) context.getBean(servicePath);
		
		service.create(person);
		
		context.close();
		
	}
	
}
