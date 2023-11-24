package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Agetest {
	
	@Test
	public void test() {
		Agevalidator obj = new Agevalidator();
		String actual = obj.agevalidate(18);
		String expect = "right to vote";
		assertEquals(expect,actual);
	}
	
	@Test
	public void test1() {
		Agevalidator obj = new Agevalidator();
		String actual = obj.agevalidate(8);
		String expect = "not the right age";
		assertEquals(expect,actual);
	}
}
