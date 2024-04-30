package com.CondtionalAndloops;

import java.util.Scanner;

public class Counting_Ocurrances {
	 public static void main(String[] args) {
		// take input to the users 
		 // input is = 13839
		 // output id= 2
		 
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int count=0;
		 while(n>0) {
			 // find last digit 
			 int rem=n%10;
			 
			 if(rem==3) {
				 count++;
			 }
			 // remove last digit into the rows
			 
			 n=n/10;
			 
			 
			 
		 }
		 // print the value 
		 System.out.println(count);
	}

}
