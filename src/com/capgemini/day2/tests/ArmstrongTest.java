package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Day2.Armstrong;

class ArmstrongTest {

	@Test
	void testCheckArmstrongNumber() {
		assertEquals(true,Armstrong.checkArmstrongNumber(153));
		assertEquals(false,Armstrong.checkArmstrongNumber(145));
		assertEquals(true,Armstrong.checkArmstrongNumber(-370));
		assertEquals(false,Armstrong.checkArmstrongNumber(0456));
		assertEquals(false,Armstrong.checkArmstrongNumber(0X153));
		assertEquals(false,Armstrong.checkArmstrongNumber('r'));
//		fail("Not yet implemented");
	}

}