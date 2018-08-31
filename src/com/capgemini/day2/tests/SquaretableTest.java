package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Day2.Squaretable;

class SquaretableTest {

	@Test
	void testCheckSquaretable() {
		assertEquals(25,Squaretable.checkSquareTable(5));
		assertEquals(4,Squaretable.checkSquareTable(2));
		assertEquals(9,Squaretable.checkSquareTable(-3));
		assertEquals(0,Squaretable.checkSquareTable(0));
		assertEquals(0.25,Squaretable.checkSquareTable(0.5));
		
//		fail("Not yet implemented");
	}

}          