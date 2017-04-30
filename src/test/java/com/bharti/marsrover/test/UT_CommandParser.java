package com.bharti.marsrover.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.bharti.marsrover.command.Command;
import com.bharti.marsrover.util.CommandStringParser;

public class UT_CommandParser {

	@Before
	public void setUp() {		
	}
	
	@Test
	public void testProcessCommandString() {
		String commandString = "MMLRR";
		List<Command> output = CommandStringParser.processCommandString(commandString);
		assertNotNull(output);
		assertEquals(5, output.size());
	}
	
	@After
	public void tearDown() {
	}
}