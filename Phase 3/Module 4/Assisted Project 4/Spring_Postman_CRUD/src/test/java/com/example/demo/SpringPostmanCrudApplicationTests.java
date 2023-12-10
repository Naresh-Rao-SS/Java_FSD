package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class SpringPostmanCrudApplicationTests {
@Autowired
EmployeeService service;

	@Test 
	public void inserttest() {
		Employee e = new Employee();
		e.setEmpname("Naresh");
		e.setEmpphone("7975405060");
		assertNotNull(service.insert(e));
	}
	
	@Test
	public void deletetest() {
	  assertEquals("deleted id of "+3,service.deletebyidtest(3));
	}


}
