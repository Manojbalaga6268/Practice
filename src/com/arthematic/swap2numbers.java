package com.arthematic;

public class swap2numbers {
	public static void main(String[] args) {

		int a = 50;
		System.out.println("a :" + a);
		int b = 100;
		System.out.println("b :" + b);

		if (a > b) {
			System.out.println("a is maximum");
		} else {
			System.out.println("a is minimum");
		}

		int samp = a;
		a = b;
		b = samp;

		System.out.println("After swaping");
		if (a > b) {
			System.out.println("a is maximum");
		} else {
			System.out.println("a is minimum");
		}

		System.out.println("a :" + a);
		System.out.println("b :" + b);

	}
}