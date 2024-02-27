package com.jpa.SpringbootOneToOne.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.jpa.SpringbootOneToOne.Entity.Employee;
import com.jpa.SpringbootOneToOne.Entity.Passport;
import com.jpa.SpringbootOneToOne.Repository.EmployeeRepository;
import com.jpa.SpringbootOneToOne.Repository.PassportRepository;
import com.jpa.SpringbootOneToOne.dto.EmployeeDto;
import com.jpa.SpringbootOneToOne.dto.PassportDto;
@Service
public class EmployeeServiceImpl implements EmployeeService 
{
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
    private PassportRepository passportRepository;
	
	private ModelMapper modelMapper;
	@Bean
	public ModelMapper getModelMapper()
	{
		modelMapper = new ModelMapper();
		return modelMapper;
	}

	public Employee createEmployeee(Employee employee) 
	{
		// TODO Auto-generated method stub
//		passportRepository.save(employee.getPassport());
		return employeeRepository.save(employee);
	}

	@Override
	public EmployeeDto findEmlpoyeeId(Long id) 
	{
		Employee employeeEntity =employeeRepository.findById(id).get();
		// TODO Auto-generated method stub
		
		ModelMapper mapper = new ModelMapper();
		EmployeeDto empDto= mapper.map(employeeEntity, EmployeeDto.class);
		return  empDto;
	}

	@Override
	public PassportDto findPassportId(Long id) {
		// TODO Auto-generated method stub
		Passport passport= passportRepository.findById(id).get();
		return modelMapper.map(passport, PassportDto.class);
	}

}
