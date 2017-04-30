package com.bharti.marsrover.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.bharti.marsrover.command.RotateLeftCommand;
import com.bharti.marsrover.domain.Coordinates;
import com.bharti.marsrover.domain.Direction;
import com.bharti.marsrover.domain.Rover;

public class UT_RotateLeftCommand {
	
	private RotateLeftCommand classUnderTest;
	
	@Before
	public void setUp() {
		classUnderTest = new RotateLeftCommand();
	}	
	
	@Test
	public void testExecute() {
		Rover rover = new Rover(new Coordinates(3, 3), Direction.E);
		classUnderTest.execute(rover);
		assertEquals(Direction.N, rover.getCurrentDirection());
	}
	
	@After
	public void tearDown() {
		classUnderTest = null;
	}
}
