package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Day2.StringPalin;

class StringPalindromeTest {

	
		class StringofPalindromeTest
		{
			@Test
			void test()
			{
				assertArrayEquals(new String[] {"121", "787","545", "454", null, null, null, null, null, null}, StringPalin.orderPalindromes(new String[] {"121","154","234","787","545","454","678","789","876","890"}));
			}

		}

//		fail("Not yet implemented");
	}


