package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

class DynamicTests {
	
	private CalculateAreaApp calculateAreaApp;
	
	@BeforeEach
	void init() {
		this.calculateAreaApp = new CalculateAreaApp();
	}

	@TestFactory
	Collection<DynamicTest> dynamicTests() {
		Collection<DynamicTest> tests = new ArrayList<>();
		tests.add(DynamicTest.dynamicTest("both arguments positive", ()-> { Assertions.assertEquals(2, calculateAreaApp.calcArea(2, 1)); } ));
		tests.add(DynamicTest.dynamicTest("one positive and one zero", ()-> { Assertions.assertEquals(0, calculateAreaApp.calcArea(10, 0)); } ));
		tests.add(DynamicTest.dynamicTest("both arguments negative", ()-> { Assertions.assertNotEquals(1, calculateAreaApp.calcArea(-1, -1)); } ));
		tests.add(DynamicTest.dynamicTest("one positive and one negative", ()-> { Assertions.assertEquals(-1, calculateAreaApp.calcArea(1, -1)); } ));
		return tests;
	}

}
