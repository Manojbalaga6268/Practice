package com.forloops;

public class forloopfactorial {
	public static void main(String[] args) {
		int factorial = 1;
		for (int a = 5; a > 0; a--) {
			factorial = factorial * a;
		}
		System.out.println("factorial:" + factorial);
	}
}