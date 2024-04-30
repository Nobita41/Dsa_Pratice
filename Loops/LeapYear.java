package com.CondtionalAndloops;

public class LeapYear {
public static void main(String[] args) {
	int y=1700;
	if((y%4==0 && y%100!=0) || y%400==0) {
		// if year is divisible by 4 then it is leap year
		// unless is it divisible by 100 but not by 400
		System.out.println("Year is leap");
	}
	else {
		System.out.println("Not leap year");
	}
}
}
