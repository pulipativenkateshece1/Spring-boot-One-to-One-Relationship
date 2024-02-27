package com.jpa.SpringbootOneToOne.dto;

import com.jpa.SpringbootOneToOne.Entity.Passport;

public class EmployeeDto 
{

	
	private Long id;
	private String firstName;
	private String lastName;
	
	private PassportDto passport;
	
	
	public PassportDto getPassport() {
		return passport;
	}
	public void setPassport(PassportDto passport) {
		this.passport = passport;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	



}
