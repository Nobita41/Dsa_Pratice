package com.CondtionalAndloops;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {
		
		int factorial=1;
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1; i<=n; i++) {
			factorial= factorial*i;
		}
		System.out.println(factorial);

	}

}
