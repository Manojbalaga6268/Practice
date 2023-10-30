package com.loops;

public class whilefactorial {
	public static void main(String[]args) {
		int a = 10;
		int factorial = 1;
		
		while(a>0) {
		factorial = factorial*a;
		a--;
		}
		System.out.println("factorial :" + factorial);

	}

}
