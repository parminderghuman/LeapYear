package com.leapyear;

public class LeapYear {

	
	public boolean isLeapYear(int year) {
		if(isDivisibleBy400(year)) {
			return true;
		}
		return false;
	}
	
	private boolean isDivisibleBy400(int year) {
	return year % 400 == 0;	
	}
}
