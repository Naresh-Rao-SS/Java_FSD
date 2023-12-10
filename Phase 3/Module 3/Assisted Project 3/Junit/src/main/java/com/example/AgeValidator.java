package com.example;

public class AgeValidator {

	public String agevalidate(int age) {
		if(age>=18) {
			return "right to vote";
		}
		else {
			return "not eligible to vote";
		}
	}
	
	
}
