package com.bharti.marsrover.domain;

import java.io.Serializable;

// Class to represent the Coordinates and operations on them
public class Coordinates implements Serializable{	
	private static final long serialVersionUID = 1L;
	
	private int xCoordinate;
	private int yCoordinate;
	
	public Coordinates(final int xCoordinate, final int yCoordinate) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	
	public int getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public int getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	
	public void incrementXCoordinate() {
		this.xCoordinate++;
	}
	
	public void incrementYCoordinate() {
		this.yCoordinate++;
	}
	
	public void decrementXCoordinate() {
		this.xCoordinate--;
	}
	
	public void decrementYCoordinate() {
		this.yCoordinate--;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + xCoordinate;
		result = prime * result + yCoordinate;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordinates other = (Coordinates) obj;
		if (xCoordinate != other.xCoordinate)
			return false;
		if (yCoordinate != other.yCoordinate)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Coordinates [xCoordinate=" + xCoordinate + ", yCoordinate="
				+ yCoordinate + "]";
	}
}