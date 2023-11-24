package com.example;

public class Agevalidator {
	public String agevalidate(int age) {
		if(age>=18) {
			return "right to vote";
		}
		else {
			return "not the right age";
		}
		
	}
}
