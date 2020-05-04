package com.leapyear;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLeapYear {

	@Test
	void TestIsLeapYear() {
		LeapYear leapYear = new LeapYear();
		boolean isLeapYear= leapYear.isLeapYear(2000);
		assertTrue(isLeapYear);
		
		isLeapYear= leapYear.isLeapYear(2100);
		assertFalse(isLeapYear);


		isLeapYear= leapYear.isLeapYear(1900);
		assertFalse(isLeapYear);
	}	

}
