package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.exception.EmplyeeNotFoundException;
import com.example.demo.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl service;
	
	@GetMapping("/getEmp/{eId}")
	public Employee  getEmployeeDetailsByEId(@PathVariable Integer eId) throws EmplyeeNotFoundException{
		
		System.out.println("Inside Controller");
		
		return service.getEmpDetailsById(eId);
		
	}
	
	@PostMapping("/addEmp")
	public String addEmp(@RequestBody Employee emp) {
		
		return service.addEmployee(emp);
	}

}
