package com.te.string;

public class ReverseOnlyAlpha {
	public static void main(String[] args) {
		String s1 = "abc#@efg&*jk";
		String ans = "";
		String rev = "";
		for(int i=s1.length()-1 ; i>=0 ; i--) {
			char ch = s1.charAt(i);
			if(ch>='a' && ch<='z') {
				rev = rev + ch;
			}
		}
		int c=0;
		for(int i=0 ; i<s1.length() ; i++) {
			char ch = s1.charAt(i);
			if(ch>='a' && ch<='z') {
				ans = ans + rev.charAt(c);
				c++;
			} else {
				ans = ans + ch;
			}
		}
		System.out.println(s1);
		System.out.println(ans);
	}

}
