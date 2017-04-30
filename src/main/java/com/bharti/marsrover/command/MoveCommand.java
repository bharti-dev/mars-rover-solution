package com.bharti.marsrover.command;

import com.bharti.marsrover.domain.Rover;

// Class to represent the Move Command
public class MoveCommand implements Command {
	
	@Override
	public void execute(final Rover rover) {
			
		switch (rover.getCurrentDirection()) {
			case E : 
				rover.getCurrentCordinates().incrementXCoordinate();
				break;
			case W:
				rover.getCurrentCordinates().decrementXCoordinate();
				break;
			case N:
				rover.getCurrentCordinates().incrementYCoordinate();
				break;
			case S:
				rover.getCurrentCordinates().decrementYCoordinate();
				break;
		}		
	}	
}