package com.forloops;

public class first100divby2 {
	public static void main(String[] args) {
//first 100 numbers divisible by 2
		for (int a = 1; a < 100; a++) {
			if (a % 2 == 0 && a % 5 == 0) {
				System.out.print("a :" + a);
			}
		}
	}

}
