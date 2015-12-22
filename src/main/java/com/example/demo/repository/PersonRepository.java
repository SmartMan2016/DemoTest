package com.example.demo.repository;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.example.demo.entity.Person;

public interface PersonRepository extends GraphRepository<Person>{

}
