package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import com.Day2.Sentence;






class SentenceTest {

			@Test
			void test() {
				//fail("Not yet implemented");
				assertEquals("this is a sentence", Sentence.correction("this is is a sentence","is",3));
			}

		}
		