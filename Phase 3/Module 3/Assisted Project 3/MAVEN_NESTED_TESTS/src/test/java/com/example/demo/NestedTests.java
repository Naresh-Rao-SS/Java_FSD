package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class NestedTests {

	@BeforeEach
	public void init() {
		System.out.println("Init on outer invoked");
	}
	
	@Nested
	class NestedClass {
		
		@BeforeEach
		public void init() {
			System.out.println("Init on inner invoked");
		}
		
		@Test
		public void test1() {
			System.out.println("Test 1 for class NestedClass");
		}
		
		@Test
		public void test2() {
			System.out.println("Test 2 for class NestedClass");
		}
		
		@Test
		@RepeatedTest(10)
		public void test3() {
			int a = 5;
			int b = 5;
			Assertions.assertEquals(a,b);
			System.out.println("Repeated Test for class NestedClass");
		}
	}

}
