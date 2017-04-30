package com.bharti.marsrover.command;

import com.bharti.marsrover.domain.Rover;

// Using command pattern
public interface Command {
	void execute(Rover rover);
}