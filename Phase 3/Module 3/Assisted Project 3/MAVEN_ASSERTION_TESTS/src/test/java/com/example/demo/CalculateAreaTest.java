package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
class CalculateAreaTest {
	
	private CalculateAreaApp calculateAreaApp;
	
	@BeforeEach
	private void init() {
		this.calculateAreaApp = new CalculateAreaApp();
	}

	@Test
	void areaTest1() {
		Assertions.assertEquals(4, calculateAreaApp.calcArea(2, 2));
	}
	
	@Test
	void areaTest2() {
		Assertions.assertEquals(0, calculateAreaApp.calcArea(0, 5));
	}
	
	@Test
	void test3() {
		Assertions.assertTrue(calculateAreaApp.calcArea(3, 5) > calculateAreaApp.calcArea(10, 1));
	}
	
	@Test
	void test4() {
		Assertions.assertFalse(calculateAreaApp.calcArea(3, 5) < calculateAreaApp.calcArea(10, 1));
	}
	
	@Test
	void test5() {
		String str = null;
		Assertions.assertNull(str);
	}
	
	@Test
	void test6() {
		String str = "Not null";
		Assertions.assertNotNull(str);
	}
	
	@Test
	void test7() {
		Assertions.assertNotEquals(12,calculateAreaApp.calcArea(10, 1));
	}
}
