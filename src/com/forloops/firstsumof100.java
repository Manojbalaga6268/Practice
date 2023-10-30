package com.forloops;

public class firstsumof100 {
	public static void main(String[] args) {
//sum of first 100 numbers
		int sum = 0;
		for (int a = 1; a <= 100; a++) {
			sum = sum + a;
		}
		System.out.println("sum of first 100 numbers :" + sum);
	}

}
