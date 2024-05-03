package com.CondtionalAndloops;

public class CountDays {

	public static void main(String[] args) {
		int Auguest=31;
		int evenCountDays=0;
		for(int i =2; i<=Auguest; i+=2) {
			if(i%2==0) {
				evenCountDays++;
			}
		}
		System.out.println("Total days" + evenCountDays);

	}

}
