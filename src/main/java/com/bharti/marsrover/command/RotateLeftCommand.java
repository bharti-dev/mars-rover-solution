package com.bharti.marsrover.command;

import com.bharti.marsrover.domain.Rover;

// Class to represent the Rotate Left Command
public class RotateLeftCommand implements Command {

	@Override
	public void execute(final Rover rover) {		
		rover.setCurrentDirection(rover.getCurrentDirection().left());
	}
}
