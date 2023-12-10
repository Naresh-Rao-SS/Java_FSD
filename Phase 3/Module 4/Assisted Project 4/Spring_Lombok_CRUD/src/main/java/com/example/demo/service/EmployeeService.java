package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.Employee;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeService {

	//creates an obj automatically wrt to the dummy object which u have created 
	@Autowired
	EmployeeRepo repo;
	
	//insert
	public Employee insert(Employee e) {
		return repo.save(e);
	}
	
	//getallrecord
	public List<Employee> getall(){
		return repo.findAll();
	}
}
