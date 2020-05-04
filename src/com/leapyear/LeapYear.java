package com.leapyear;

public class LeapYear {

	public boolean isLeapYear(int year) {
		if (isDivisibleBy400(year) ) {
			return true;
		}else if(!isDivisibleBy400(year) && isDivisibleBy100(year)) {
			return false;
		}
		return false;
	}

	private boolean isDivisibleBy400(int year) {
		return year % 400 == 0;
	}
	
	private boolean isDivisibleBy100(int year) {
		return year % 100 == 0;
	}
}
