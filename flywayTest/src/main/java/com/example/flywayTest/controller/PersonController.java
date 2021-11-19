package com.example.flywayTest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.flywayTest.entity.Person;
import com.example.flywayTest.service.PersonService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping("/")
public class PersonController {
	@Autowired
	PersonService personSer;
	
	@GetMapping("/persons")
	public List<Person> getAllPersons() {
		List<Person> pList=personSer.getPerson(null);
		return pList;
	}
	@GetMapping("/persons/{personId}")
	public  ResponseEntity<Person> getOnePerson(@PathVariable(value = "personId") Long personId) {
		List<Person> pList=personSer.getPerson(personId);
		//return pList.get(0);
		return new ResponseEntity<Person>(pList.get(0), HttpStatus.OK);
	}
	@PostMapping("/persons")
	public Person createPerson(@RequestBody Person person) {
		return personSer.savePerson(person);
	}
}
