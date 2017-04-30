package com.bharti.marsrover.client;

import java.util.List;

import com.bharti.marsrover.command.Command;
import com.bharti.marsrover.domain.Coordinates;
import com.bharti.marsrover.domain.Direction;
import com.bharti.marsrover.domain.Plateau;
import com.bharti.marsrover.domain.Rover;
import com.bharti.marsrover.exception.CoordinatesOutRangeException;
import com.bharti.marsrover.util.CommandStringParser;

/*
 * Class to Test the Rover based on coordinates and commands supplied.
 */
public class TestMarsRover {
	
	public static void main(String[] args) {
		Rover rover = null;
		List<Command> commandsForRover = null;
		
		// Plateau created with coordinates 5,5
		Plateau plateau = new Plateau(new Coordinates(5, 5));
				
		try {			
			// First Rover processing commands
			rover = new Rover(new Coordinates(1, 2), Direction.N);
			commandsForRover = CommandStringParser.processCommandString("LMLMLMLMM");
			rover.process(commandsForRover);
			plateau.validateCoordinates(rover.getCurrentCordinates());
			System.out.println(rover);
			
			// Second Rover processing commands
			rover = new Rover(new Coordinates(3, 3), Direction.E);
			commandsForRover = CommandStringParser.processCommandString("MMRMMRMRRM");
			rover.process(commandsForRover);
			plateau.validateCoordinates(rover.getCurrentCordinates());
			System.out.println(rover);
		
		} catch (CoordinatesOutRangeException e) {
			e.printStackTrace();
		}	
	}
}