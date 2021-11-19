package com.example.flywayTest.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.flywayTest.entity.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person,Long>{

	
}
