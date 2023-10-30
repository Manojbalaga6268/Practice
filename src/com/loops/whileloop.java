package com.loops;

public class whileloop {
	public static void main(String[] args) {
		int num = 15;

		while (num > 0) {
			if (num % 5 == 0) {
				System.out.println("num :" + num);

			}
			num--;
		}
		int a = 100;

		while (a > 0) {
			if (a % 2 == 0 && a % 3 == 0 && a % 5 == 0) {
				System.out.println("a is divisible by THREE the numbers");
				System.out.println("a :" + a);
			}
				a--;
			}
		
		while (a < 100) {
			if (a % 2 == 0) {
				System.out.println("'100 divisible by 2 numbers'");
				System.out.println("a :" + a);
			}
			a++;
		}
	}

}
