package com.bharti.marsrover.command;

import com.bharti.marsrover.domain.Rover;

// Class to represent the Rotate Right Command
public class RotateRightCommand implements Command {

	@Override
	public void execute(final Rover rover) {		
		rover.setCurrentDirection(rover.getCurrentDirection().right());
	}
}
