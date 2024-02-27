package com.jpa.SpringbootOneToOne.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.jpa.SpringbootOneToOne.Entity.Employee;
import com.jpa.SpringbootOneToOne.dto.EmployeeDto;
import com.jpa.SpringbootOneToOne.dto.PassportDto;
import com.jpa.SpringbootOneToOne.service.EmployeeService;

@Controller
public class EmployeeRestController 
{
	@Autowired
	
	private EmployeeService employeeService;
	@PostMapping("createEmployee")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee)
	{
		return new ResponseEntity<Employee>(employeeService.createEmployeee(employee), HttpStatus.CREATED);
	}
	@GetMapping("findEmployee/{id}")
	public ResponseEntity<EmployeeDto> findEmployeeById(@PathVariable Long id)
	{
		  EmployeeDto employeeDto = employeeService.findEmlpoyeeId(id);
		  
		  
		  return new ResponseEntity<EmployeeDto>(employeeDto,HttpStatus.OK);
	}
	@GetMapping("findpassport/{id}")
	public ResponseEntity<PassportDto> findPassport(@PathVariable Long id)
	{
		 PassportDto passportDto = employeeService.findPassportId(id);
		  
		  
		  return new ResponseEntity<PassportDto>(passportDto,HttpStatus.OK);
	}
	
	

}
