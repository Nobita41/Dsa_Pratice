package com.CondtionalAndloops;

public class LCM_of_TwoNumbers {

	public static void main(String[] args) {
		
		int n2=24;
		int n1=36;
		int On1=n1;
	int	On2=n2;
		
		while(n1%n2!=0) {
			int rem=n1%n2;
			n2=n1;
			n2= rem;
		}
		int gcd=n2;
		System.out.println(gcd);
		int Lcm=(On1*On2)/ gcd;
		System.out.println(Lcm);
	}

}
