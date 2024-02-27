package com.jpa.SpringbootOneToOne.service;

import com.jpa.SpringbootOneToOne.Entity.Employee;
import com.jpa.SpringbootOneToOne.Entity.Passport;
import com.jpa.SpringbootOneToOne.dto.EmployeeDto;
import com.jpa.SpringbootOneToOne.dto.PassportDto;

public interface EmployeeService 
{
	Employee createEmployeee(Employee employee);
	EmployeeDto findEmlpoyeeId(Long id);
	PassportDto findPassportId(Long id);
	

}
