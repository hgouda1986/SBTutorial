package com.example.flywayTest.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.flywayTest.entity.Person;
@Service
public interface PersonService {
	public  List<Person> getPerson(Long personId);
	public  Person savePerson(Person person);
}
