package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Day2.MissingElementCheck;

class MissingElementTest {

	@Test
	void testMissing() {
		assertEquals(3,MissingElementCheck.checkTheMissingElement(new int[] {1,2,4,5,6}));
//		fail("Not yet implemented");
	}

}
