package com.Day2;

public class SubjectMarks {

	public static String findGrade(int english, int science, int maths) {
		// TODO Auto-generated method stub
		if(english>60 && science>60 && maths>60)
		return("Pass");
		else if((english>60 && science>60)||(english>60 && maths>60)||(science>60 && maths>60))
		return("Promoted");
		else
			return("Fail");
	}
	 

}
