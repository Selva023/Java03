package org.string;

import java.util.Scanner;

public class Tables {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for (int i = 1; i <=20; i++) {
			System.out.println(a+"*"+i+"="+a*i);
			
		}
	}

}
