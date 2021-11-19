package com.example.flywayTest.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
@Entity
@Table(name = "persons")
public class Person implements Serializable{
	
	public Long getPersonId() {
		return personId;
	}


	public void setPersonId(Long personId) {
		this.personId = personId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PERSON_ID")
	private Long personId;
	
	@NotBlank
	@Column(name="NAME")
	private String name;
	
	@NotBlank
	@Column(name="MOBILE_NO")
	private String mobileNo;
	
	
	@Column(name="AGE")
	private Integer age;
}
