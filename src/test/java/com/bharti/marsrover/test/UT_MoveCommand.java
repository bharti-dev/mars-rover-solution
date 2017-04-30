package com.bharti.marsrover.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.bharti.marsrover.command.MoveCommand;
import com.bharti.marsrover.domain.Coordinates;
import com.bharti.marsrover.domain.Direction;
import com.bharti.marsrover.domain.Rover;


public class UT_MoveCommand {

	private MoveCommand classUnderTest;
	
	@Before
	public void setUp() {
		classUnderTest = new MoveCommand();
	}	

	@Test
	public void testExecuteToMoveInDirectionE() {
		Rover rover = new Rover(new Coordinates(1,1), Direction.E);
		classUnderTest.execute(rover);
		assertEquals(2, rover.getCurrentCordinates().getxCoordinate());
	}
	
	@Test
	public void testExecuteToMoveInDirectionW() {
		Rover rover = new Rover(new Coordinates(1,1), Direction.W);
		classUnderTest.execute(rover);
		assertEquals(0, rover.getCurrentCordinates().getxCoordinate());
	}
	
	@Test
	public void testExecuteToMoveInDirectionN() {
		Rover rover = new Rover(new Coordinates(1,1), Direction.N);
		classUnderTest.execute(rover);
		assertEquals(2, rover.getCurrentCordinates().getyCoordinate());
	}
	
	@Test
	public void testExecuteToMoveInDirectionS() {
		Rover rover = new Rover(new Coordinates(1,1), Direction.S);
		classUnderTest.execute(rover);
		assertEquals(0, rover.getCurrentCordinates().getyCoordinate());
	}
	
	@After
	public void tearDown() {
		classUnderTest = null;
	}
}
