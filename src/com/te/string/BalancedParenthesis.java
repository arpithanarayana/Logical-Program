package com.te.string;

public class BalancedParenthesis {
	public static boolean balance(String s) {
		int bal = 0;
		for(int i=0 ; i<s.length() ; i++) {
			char ch = s.charAt(i);
			if(ch=='(' || ch=='[' || ch=='{') {
				bal++;
			} else if(ch==')' || ch==']' || ch=='}') {
				bal--;
				if(bal<0) {
					return false;
				}
			}
		}
		return bal==0;
	}
	public static void main(String[] args) {
		String s = "({[})";
		boolean isBalance = balance(s);
		if(isBalance) {
			System.out.println("string is balanced");
		} else {
			System.out.println("string is not balanced");
		}
	}

}
