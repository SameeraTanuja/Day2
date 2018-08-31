package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Day2.DiscountItem;

class FindDiscountTest {

	@Test
	void testFindDiscount() {
		assertEquals(65.0, DiscountItem.findDiscount(100));

//		fail("Not yet implemented");
	}

}
