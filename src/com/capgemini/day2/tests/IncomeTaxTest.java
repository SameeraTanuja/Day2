package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Day2.IncomeTax;

class IncomeTaxTest {

	@Test
	void testCheckIncomeTax() {
		assertEquals(0,IncomeTax.checkIncomeTax(100000));
		assertEquals(20000,IncomeTax.checkIncomeTax(200000));
		assertEquals(80000,IncomeTax.checkIncomeTax(400000));
		assertEquals(180000,IncomeTax.checkIncomeTax(600000));
//		fail("Not yet implemented");
	}

}
