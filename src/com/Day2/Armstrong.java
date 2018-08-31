package com.Day2;

public class Armstrong {
public static boolean checkArmstrongNumber(int number) {
	int originalNumber=number;
	int digit;
	int sum=0;
	while(number!=0) {
		digit=number%10;
		sum=sum+digit*digit*digit;
		number=number/10;
	}
		if(originalNumber==sum)
			return true;
		else
			return false;
	
}
}
