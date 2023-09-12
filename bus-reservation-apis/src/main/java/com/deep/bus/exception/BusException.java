package com.deep.bus.exception;

public class BusException extends RuntimeException{

	String message;

	public BusException() {
			
	}
	
	
	public BusException(String message) {
		super(message);
		
	}
	
	
	
}
