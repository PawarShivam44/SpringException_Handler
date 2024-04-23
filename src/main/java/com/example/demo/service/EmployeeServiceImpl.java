package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.exception.EmplyeeNotFoundException;
import com.example.demo.repo.Emprepo;
@Service
public class EmployeeServiceImpl {

	@Autowired
	private Emprepo emprepo;

	public Employee getEmpDetailsById(Integer id) throws EmplyeeNotFoundException {
		
		if(id==1) {
			
			return new Employee(id, "Prakash", 25, "prakash@gmail.com");
		}else {
			
			throw new EmplyeeNotFoundException("EmplyeeNotFoundException");
		}
		
	}
	
	public String addEmployee(Employee emp) {
		
		emprepo.save(emp);
		return "Employee Details Added ....";
	}

}
