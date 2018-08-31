package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Day2.ChangeDateFormat;

class DateTest {

	@Test
	void testdateFormatChange() {
		//fail("Not yet implemented");
		assertEquals("26/aug/1996",ChangeDateFormat.dateFormatChange("26,08,1996"));
	}

}



