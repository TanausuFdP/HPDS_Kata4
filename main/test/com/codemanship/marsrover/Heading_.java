package com.codemanship.marsrover;

import org.junit.Test;
import refactoring.SimpleViewPoint;

import static org.junit.Assert.assertEquals;
import static refactoring.SimpleViewPoint.Heading.*;

public class Heading_ {

	@Test
	public void should_be_created_from_string() {
		assertEquals(North, SimpleViewPoint.Heading.of("N"));
		assertEquals(South, SimpleViewPoint.Heading.of("S"));
		assertEquals(East, SimpleViewPoint.Heading.of("E"));
		assertEquals(West, SimpleViewPoint.Heading.of("W"));
	}

	@Test
	public void should_be_created_from_char() {
		assertEquals(North, SimpleViewPoint.Heading.of('N'));
		assertEquals(South, SimpleViewPoint.Heading.of('S'));
		assertEquals(East, SimpleViewPoint.Heading.of('E'));
		assertEquals(West, SimpleViewPoint.Heading.of('W'));
	}

	@Test
	public void should_be_able_turn_right() {
		assertEquals(East, North.turnRight());
		assertEquals(South, East.turnRight());
		assertEquals(West, South.turnRight());
		assertEquals(North, West.turnRight());
	}

	@Test
	public void should_be_able_turn_left() {
		assertEquals(West, North.turnLeft());
		assertEquals(North, East.turnLeft());
		assertEquals(East, South.turnLeft());
		assertEquals(South, West.turnLeft());
	}
}
