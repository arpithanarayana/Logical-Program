package com.te.string;

/*
 * write a program to check if a sentence is a palindrome or not. You can ignore white spaces and other
 * characters to consider a sentences as a palindrome
 */
public class CheckSentenceIsPalindromeOrot {
	public static boolean check(String s) {
		int l=0;
		int h = s.length()-1;
		
		while(l<=h) {
			char ch1 = s.charAt(l);
			char ch2 = s.charAt(h);
			if(!(ch1>='a' && ch1<='z')) {
				l++;
			} else if(!(ch2>='a' && ch2<='z')) {
				h--;
			} else if(ch1==ch2) {
				l++;
				h--;
			} else {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String s = "too hot toot";
		boolean isCheck = check(s);
		if(isCheck) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
