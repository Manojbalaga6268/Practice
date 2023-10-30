package com.arthematic;

public class ifclause {
	public static void main(String[] args) {

		int a = 40;
		int b = 50;

		if (a > 30 && a < 50) {
			System.out.println("a is greater than 30 and lessthan 50");
		}
		if (a % 5 == 0 && a % 2 == 0) {
			System.out.println("a is divisible by both tghe numbers");
		} else {
			System.out.println("a is not divisible by both the numbers");
		}

		if (a % 3 == 0 || a % 6 == 0) {
			System.out.println("a is divisible by 2 or 6 ");
		} else {
			System.out.println("a is not divisible any of both the numbers");
		}
		if (a > b) {
			System.out.println("a is maximum number");
		} else if (a < b) {
			System.out.println("b is maximum number");
		}
	}

}
