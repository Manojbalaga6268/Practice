package com.loops;

public class abc {
	public static void main(String[] args) {
		int a = 5;
		int factorial = 1;
		while (a > 0) {
			factorial = factorial * a;
			a--;
		}
		System.out.println("factorial :" + factorial);
	}
}
