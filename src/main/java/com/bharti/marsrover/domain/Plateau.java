package com.bharti.marsrover.domain;

import java.io.Serializable;

import com.bharti.marsrover.exception.CoordinatesOutRangeException;

// Plateau class to represent a Plateau and its top right coordinates
public class Plateau implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Coordinates topRightCoordinates;
	
	public Plateau(final Coordinates topRightCoordinates) {
		this.topRightCoordinates = topRightCoordinates;
	}	
		
	// Method to validate the Rover coordinates are in Range or Not. 
	// Throws CoordinatesOutRangeException if coordinates are out of range.
	public void validateCoordinates(Coordinates coordinates) throws CoordinatesOutRangeException {
		if (coordinates.getxCoordinate() < 0 || coordinates.getyCoordinate() < 0 || this.topRightCoordinates.getxCoordinate() < coordinates.getxCoordinate()
				|| this.topRightCoordinates.getyCoordinate() < coordinates.getyCoordinate()) {
			throw new CoordinatesOutRangeException("Rover out of Plateau coordinates");
		}
	}
	
	public Coordinates getTopRightCoordinates() {
		return topRightCoordinates;
	}
	
	public void setTopRightCoordinates(Coordinates topRightCoordinates) {
		this.topRightCoordinates = topRightCoordinates;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((topRightCoordinates == null) ? 0 : topRightCoordinates
						.hashCode());
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
		Plateau other = (Plateau) obj;
		if (topRightCoordinates == null) {
			if (other.topRightCoordinates != null)
				return false;
		} else if (!topRightCoordinates.equals(other.topRightCoordinates))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Plateau [topRightCoordinates=" + topRightCoordinates + "]";
	}
}