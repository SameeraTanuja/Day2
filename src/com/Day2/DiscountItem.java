package com.Day2;

public class DiscountItem {

	public static double findDiscount(double itemValue) {
		double discount = (double) (itemValue * 0.35);
		double newPrice = itemValue - discount;
		// TODO Auto-generated method stub
		return newPrice;
	}
	

}
