package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	//creates an obj automatically wrt to the dummy object which u have created 
	@Autowired
	EmployeeRepo repo;

	//insert
	public Employee insert(Employee e) {
		return repo.save(e);
	}

	//insertall
	public List<Employee> insertall(List<Employee> e) {
		return repo.saveAll(e);
	}

	//getallrecord
	public List<Employee> getall(){
		return repo.findAll();
	}

	//getbyid
	//getbyid--primary key -int
	/*
	 * public Optional<Employee> getByid(int id) { return repo.findById(id); }
	 */

	/*
	 * public Employee getByid(int id) { return repo.findById(id).orElse(null); }
	 */

	public void deletebyid(int id) {
		repo.deleteById(id);
	}

	public void deteall() {
		repo.deleteAll();
	}

	//deleteAll-deleting all records 
	public String deletebyidtest(int id) {
		repo.deleteById(id);
		return "deleted id of "+id;
	}

	//				{id:5,name:"updated name"}
	public Employee updatename(Employee e) {
		Employee ee = repo.findById(e.getEmpid()).orElse(null);
		ee.setEmpname(e.getEmpname());
		return repo.save(ee);
	}


	//predefined method
	public String findphono(String name,int id) { return
			repo.findPhono(name, id); }

	public Optional<Employee> getByid(int id) {
		return repo.findById(id);
	}

}
