package com.example;

public class Aircel implements Sim {
	
	private String signal;
	
	public Aircel(String signal) {
		this.signal = signal;
	}
	public String getSignal() {
		return signal;
	}



	@Override
	public void TypeOfSim() {
		System.out.println("This is Aircel Sim");
		
	}

	@Override
	public void DataType() {
		System.out.println("This is 2G Data");
		
	}
}
