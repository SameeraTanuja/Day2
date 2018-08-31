package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Day2.Reversestr;

	class ReverseTest
	{

		@Test
		void testReverseString() 
		{
			assertEquals("areemaS ",Reversestr.findReverse("Sameera"));
		}
	}


	