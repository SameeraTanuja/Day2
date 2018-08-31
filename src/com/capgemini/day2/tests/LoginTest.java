package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Day2.LoginCheck;

class LoginTest {

	@Test
	void testLogin() {
		assertEquals("Welcome", LoginCheck.checkLoginDetails("Sameera", "9807abc"));
		assertEquals("Invalid Credentials, Contact the Admin", LoginCheck.checkLoginDetails("Sameera", "98071abc"));
		
//		fail("Not yet implemented");
	}

}
