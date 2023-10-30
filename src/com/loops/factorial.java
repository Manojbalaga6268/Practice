package com.loops;

public class factorial {
	public static void main(String[] args) {
		int num = 12;
		int factorial = 1;

		while (num > 1) {
			factorial = factorial * num;
			num--;
			 System.out.println("factorial :" +factorial);

		}
		System.out.println("factorial :" + factorial);
	}

}
