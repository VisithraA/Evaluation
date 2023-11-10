package com.zsgs.problems;

import java.util.Scanner;

public class ZohoPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input : ");
		String str = sc.next();
		System.out.print("Number of num : ");
		int num = sc.nextInt();
		pattern(str, num);
	}

	static void pattern(String str, int num) {

		int x = 2 * num - 2;

		for (int i = 0; i < num; i++) {
			int y = x - 2 * i;
			for (int j = i; j < str.length(); j = j + x) {
				System.out.print(str.charAt(j));
				if (y > 0 && y < x && y + j < str.length()) {
					for (int k = 0; k < (x - num - i); k++)
						System.out.print(" ");
					System.out.print(str.charAt(j + y));
					for (int k = 0; k < i - 1; k++)
						System.out.print(" ");
				} else {
					for (int k = 0; k < (x - num); k++)
						System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
