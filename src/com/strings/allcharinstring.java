package com.strings;

public class allcharinstring {
	public static void main(String[]args) {
		String name = "balaga";
		int count = 0;
		int length = name.length();
		for(int i = 0; i<length; i++) {
			if (name.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println(count);
	}

}
