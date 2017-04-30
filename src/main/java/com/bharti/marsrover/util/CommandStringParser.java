package com.bharti.marsrover.util;

import java.util.ArrayList;
import java.util.List;

import com.bharti.marsrover.command.Command;
import com.bharti.marsrover.command.factory.CommandFactory;

// This parser class create a list of commands from Command String. 
// It utilizes the Command factory class to create the commands.  
public class CommandStringParser {
	
	// This method process the command string and create the List of commands from that.
	public static List<Command> processCommandString(final String commandString) {
		List<Command> commands = null;
		
		if (commandString != null) {
			CommandFactory factory = CommandFactory.getInstance();
			commands = new ArrayList<Command>();
			
			for (int i=0; i<commandString.length(); i++) {
				commands.add(factory.getCommand(String.valueOf(commandString.charAt(i))));
			}
		}
		
		return commands;
	}
}