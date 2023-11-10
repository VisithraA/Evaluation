package com.zsgs.problems;

import java.util.Scanner;

public class LargeString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of strings to be entered = ");
		int n = sc.nextInt();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the String" + (i + 1) + " : ");
			str[i] = sc.next();
		}
		findLarge(str);

	}

	static void findLarge(String[] str) {

		for (int i = 0; i < str.length; i++) {
			String s = str[i];
			char[] ch = s.toCharArray();

			for (int j = 0; j < ch.length - 1; j++) {
				for (int k = 0; k < ch.length - 1; k++) {
					if (ch[k] < ch[k + 1]) {
						char temp = ch[k];
						ch[k] = ch[k + 1];
						ch[k + 1] = temp;
					}
				}
			}

			String string = new String(ch);
			System.out.println("String" + (i + 1) + " : " + string);
		}

	}
}
