package com.zsgs.problems;

import java.util.Scanner;

public class JumbledNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the Number = ");
		int num=sc.nextInt();
		boolean jumble=isJumbled(num);
		if(jumble)
			System.out.println(num+" is a jumbled number");
		else
			System.out.println(num+" is not a jumbled number");
			
	}

	static boolean isJumbled(int num) {
		while(num>9) {
			int mod1=num%10;
			num/=10;
			int mod2=num%10;
			
			if(Math.abs(mod1-mod2)!=1)
				return false;
		}
		
		return true;
	}
}
