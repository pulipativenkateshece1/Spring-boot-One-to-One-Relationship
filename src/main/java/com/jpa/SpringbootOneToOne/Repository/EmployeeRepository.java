package com.jpa.SpringbootOneToOne.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.SpringbootOneToOne.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> 
{
	

}
