package com.patterns;

public class Question8 {
public static void main(String[] args) {
	int n=5;
	int space = 8;
	for (int i = 1; i <= n; i++) {

		for (int j = 1; j <=  i; j++) {
			System.out.print("*");
		}
		for (int j = 1; j <=space; j++) {
			System.out.print(" ");
		}
		for (int j = 1; j <=  i; j++) {
			System.out.print("*");
		}
		space -= 2;
		System.out.println();

	}
	 space = 2;
	for (int i = 1; i <= n; i++) {

		for (int j = 1; j <= n - i; j++) {
			System.out.print("*");
		}
		for (int j = 1; j <= space; j++) {
			System.out.print(" ");
		}
		for (int j = 1; j <= n - i; j++) {
			System.out.print("*");
		}
		space += 2;
		System.out.println();

	}

}
}
