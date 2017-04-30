package com.bharti.marsrover.domain;

import java.io.Serializable;
import java.util.List;

import com.bharti.marsrover.command.Command;

// Class to represent the Rover. It also exposed the methods to
// set the coordinates and direction. Also it has methods to update
// its coordinates on the basis of commands. It process the commands
// and update its parameters.
public class Rover implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Coordinates currentCordinates;
	private Direction currentDirection;
	
	public Rover(Coordinates coordinates, Direction direction) {
		this.currentCordinates = coordinates;
		this.currentDirection = direction;
	}
	
	// Method to process user supplied commands
	public void process(List<Command> commands) {
		for (Command command : commands) {
			command.execute(this);
		}
	}

	public Coordinates getCurrentCordinates() {
		return currentCordinates;
	}
	
	public void setCurrentCordinates(Coordinates currentCordinates) {
		this.currentCordinates = currentCordinates;
	}

	public Direction getCurrentDirection() {
		return currentDirection;
	}
	
	public void setCurrentDirection(Direction currentDirection) {
		this.currentDirection = currentDirection;
	}

	@Override
	public String toString() {
		StringBuilder toStringOutput = new StringBuilder();
		toStringOutput.append(currentCordinates.getxCoordinate()).append(" ").append(currentCordinates.getyCoordinate()).append(" ").append(currentDirection);
		return toStringOutput.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((currentCordinates == null) ? 0 : currentCordinates
						.hashCode());
		result = prime
				* result
				+ ((currentDirection == null) ? 0 : currentDirection.hashCode());
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
		Rover other = (Rover) obj;
		if (currentCordinates == null) {
			if (other.currentCordinates != null)
				return false;
		} else if (!currentCordinates.equals(other.currentCordinates))
			return false;
		if (currentDirection != other.currentDirection)
			return false;
		return true;
	}
}