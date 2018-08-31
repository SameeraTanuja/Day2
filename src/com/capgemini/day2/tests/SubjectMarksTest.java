package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Day2.SubjectMarks;

class SubjectMarksTest {

	@Test
	void testCheckSubjectmarks() {
		assertEquals("Pass",SubjectMarks.findGrade(70,80,90));
		assertEquals("Fail",SubjectMarks.findGrade(40,30,20));
		assertEquals("Promoted",SubjectMarks.findGrade(50,70,80));
//		fail("Not yet implemented");
	}

}
