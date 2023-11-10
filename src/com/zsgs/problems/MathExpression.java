package com.zsgs.problems;

import java.util.Scanner;
import java.util.Stack;

public class MathExpression {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input : ");
		String str=sc.next();
		boolean valid=isValid(str);
		if(valid)
			System.out.println("Output : Valid");
		else
			System.out.print("Output : Invalid");
	}

	 static boolean isValid(String str) {
		
		Stack<Character> stack=new Stack<>();
		
		for(char ch:str.toCharArray()) {
			if(ch=='(')
				stack.push(ch);
			else if(ch==')') {
				if(stack.isEmpty())
					return false;
				stack.pop();
			}
		}
		
		
		 
		return stack.isEmpty();
	}

	
}
