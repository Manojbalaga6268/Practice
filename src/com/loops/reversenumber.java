package com.loops;

public class reversenumber {
	public static void main(String[]args) {
		int num = 2323;
		int reverse = 0;
		
		while(num>0) {
			int reminder = num%10;
			reverse = (reverse*10) + reminder;
					num=num/10;
		}
		System.out.println("reversed num " + reverse);
	
	int a = 987654321;
	int rev = 0;
	while (a>0) {
		int reminder = a%10;
		rev = (rev*10)+reminder;
		a = a/10;
	}
	System.out.println("reversed number :" + rev);
	}

}
