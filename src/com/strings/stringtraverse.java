package com.strings;

public class stringtraverse {
	public static void main(String[] args) {
		String name = "Balaga Manoj Kumar";
		int length = name.length();
		System.out.println(name.length());

		for (int i = 0; i < length; i++) {
			System.out.print(name.charAt(i));
		}

		System.out.println();
		for (int i = length - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}

	}
}
