package com.Day2;

public class LoginCheck {
	public static String checkLoginDetails(String userId, String Password) {
		String name="Sameera" , passwd = "9807abc";
		String Valid = "";
		String NotValid="";
		if(userId.equals(name) && Password.equals(passwd)) {
			Valid = "Welcome";
			return Valid;
		}
		NotValid = "Invalid Credentials, Contact the Admin";
		return NotValid;
				
	}

}
