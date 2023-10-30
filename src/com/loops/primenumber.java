package com.loops;

public class primenumber {
	public static void main(String[]args) {
		int num = 11;
		int count = 2;
		boolean isprime = true;
		
		while(count<num) {
			if(num%count==0) {
				isprime=false;
				System.out.println("it is not a prime number");
				break;
			}
			count++;
		}
		if(isprime)
		{System.out.println("it is prime number");
			}
		}
	}
		