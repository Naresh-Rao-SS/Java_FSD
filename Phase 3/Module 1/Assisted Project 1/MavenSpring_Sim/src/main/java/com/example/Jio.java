package com.example;

public class Jio implements Sim {
	
	private String signal;
	
	public String getSignal() {
		return signal;
	}

	public void setSignal(String signal) {
		this.signal = signal;
	}

	
	
	@Override
	public void TypeOfSim() {
		System.out.println("This is Jio Sim");
		
	}

	@Override
	public void DataType() {
		System.out.println("This is 5G Data");
		
	}
	

}
