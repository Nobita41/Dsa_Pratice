package com.CondtionalAndloops;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	int d=2;// it is check that number is divisible by 2 or not
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	while(d<=n-1)// number goes to 2 to d 
	
	{
		if(n%d==0) // check number is divisible by 2 or not  if it divisible then number is not prime
		{
			System.out.println("Not prime");
			return;// if number is not a prime then it not execute further code and return the not prime
			
		}
		d=d+1; // it increment the loop like those number not divide by 2 the it increase like 3 then 4 then 5........n
		}
		
			System.out.println("Prime");// if number is prime then it gives the prime number output
		
	}

}
