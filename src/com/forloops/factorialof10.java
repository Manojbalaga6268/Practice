package com.forloops;

public class factorialof10 {
	public static void main(String[] args) {
		int factorial = 1;
		for (int a = 10; a > 0; a--) {
			factorial = factorial * a;
		}
		System.out.println("factorial :" + factorial);
	}

}
