package org.string;

public class Abc {
	public static void main(String[] args) {
		String a ="how are you";
		int length = a.length();
		System.out.println(length);
		char charAt = a.charAt(5);
		System.out.println(charAt);
		String a2 ="How Are You";
		boolean equals = a2.equals(a);
		System.out.println(equals);
		boolean equalsIgnoreCase = a2.equalsIgnoreCase(a);
		System.out.println(equalsIgnoreCase);
		boolean endsWith = a.endsWith("ou");
		System.out.println(endsWith);
		String upperCase = a2.toUpperCase();
		System.out.println(upperCase);
		boolean contentEquals = a.contentEquals(upperCase);
		System.out.println(contentEquals);
		String substring = a.substring(5);
		System.out.println(substring);
		String substring2 = a.substring(8);
		System.out.println(substring2);
		String replace = a2.replace('o','X');
		System.out.println(replace);
		
	
		
	}
	
	

}
