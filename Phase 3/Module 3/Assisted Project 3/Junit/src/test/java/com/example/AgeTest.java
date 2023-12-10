package com.example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AgeTest {
	 static AgeValidator validobj;
	
	@BeforeClass
	public static void init() {
		validobj=new AgeValidator();
	}
	
	@Test //testcase
	public void test1() {
		String actual=validobj.agevalidate(18);
		String expect="right to vote";
		assertEquals(expect, actual);
	}
	@Test
	public void test2() {
		String actual=validobj.agevalidate(8);
		String expect="not eligible to vote";
		assertEquals(expect, actual);
	}
	
	  @AfterClass
	  public static void Destroy() { 
		  validobj=null;
	  }
	 

}
