package com.example.flywayTest.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flywayTest.entity.Person;
import com.example.flywayTest.respository.PersonRepository;
@Service
public class PersonServiceImpl implements PersonService{
	@Autowired
	PersonRepository personRepo;
	@Override
	public List<Person> getPerson(Long personId) {
		// TODO Auto-generated method stub
		List<Person> pList=new ArrayList<>();
		if(personId!=null && personId>0) {
			//get one 
			Optional<Person> personOp = personRepo.findById(personId);
			if(!personOp.isEmpty()) {
				pList.add(personOp.get()) ;
			}
		}else {
			//get all
			pList=personRepo.findAll();
		}
		return pList;
	}
	@Override
	public Person savePerson(Person person) {
		// TODO Auto-generated method stub
		return personRepo.save(person);
	}

}
