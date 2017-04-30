package com.bharti.marsrover.exception;

// This exception will be thrown when Rover goes outside the boundaries of
// Plateau.
public class CoordinatesOutRangeException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public CoordinatesOutRangeException(String message) {
		super(message);
	}
}
