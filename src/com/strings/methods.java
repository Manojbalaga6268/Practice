package com.strings;

public class methods {
	public static void main(String[]args) {
		String name = "Manoj Kumar Balaga     ";
		String nam =  "Manoj Kumar Balaga";
		
		System.out.println(name.charAt(4));
		System.out.println(name.contains("Kumar"));
		System.out.println(name.endsWith("Balaga"));
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.trim());
		System.out.println(nam.indent(1));
		System.out.println(nam.isBlank());
		System.out.println(nam.startsWith("Manoj"));
		System.out.println(nam.length());
	}

}
