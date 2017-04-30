package com.bharti.marsrover.command.factory;

import com.bharti.marsrover.command.Command;
import com.bharti.marsrover.command.MoveCommand;
import com.bharti.marsrover.command.RotateLeftCommand;
import com.bharti.marsrover.command.RotateRightCommand;
/*
 * This is a Command Factory Singleton class used to create command objects with the help of command name.
 */
public class CommandFactory {
	// Command Factory instance created during class load.
	private static final CommandFactory instance = new CommandFactory();
		
	private CommandFactory() {
	}
	
	// This enum has all the valid commands for this system
	public enum CommandSet {
		L("L"), R("R"), M("M");
		
		private String value;
		
		private CommandSet(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
	}
	
	// Factory method to create the commands
	public Command getCommand(final String commandName) {		
		CommandSet command = CommandSet.valueOf(commandName);
		Command returnCommand = null;
		
		switch(command) {		
			case L: 
				returnCommand = new RotateLeftCommand();			
				break;
			case R:
				returnCommand = new RotateRightCommand();
				break;
			case M:
				returnCommand = new MoveCommand();
				break;
		}
		
		return returnCommand;
	}
	
	// Method to obtain the command factory
	public static CommandFactory getInstance() {
		return instance;
	}	
}