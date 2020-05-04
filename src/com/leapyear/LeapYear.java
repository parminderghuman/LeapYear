package com.leapyear;

public class LeapYear {

	
	public boolean isLeapYear(int year) {
		if(year % 200 == 0) {
			return true;
		}
		return false;
	}
}
