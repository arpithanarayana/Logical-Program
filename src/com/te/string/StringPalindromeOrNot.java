package com.te.string;

public class StringPalindromeOrNot {
	public static void main(String[] args) {
		String s1 = "mom";
		String s2 = "";
		for(int i=s1.length()-1 ; i>=0 ; i--) {
			s2 = s2 + s1.charAt(i);
		}
		if(s1.equals(s2)) {
			System.out.println("Given string is palindrome");
		} else {
			System.out.println("Given string is not palindrome");
		}
	}

}
