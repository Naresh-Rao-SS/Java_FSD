package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Testing {
	//BeforeClass -  only once use static in method			BeforeEach  
	//Before -  every time before test runs 				BeforeAll
	//same for after								
	//junit 4												Junit 5
	
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	@Test
	public void test1() {
		System.out.println("Test Case 1");
	}
	@Test
	public void test2() {
		System.out.println("Test Case ");
	}
	@After
	public void after() {
		System.out.println("After");
	}

}
