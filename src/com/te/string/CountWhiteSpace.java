package com.te.string;

public class CountWhiteSpace {
	public static void main(String[] args) {
		String s = "hello hill  byee";
		int c=0;
		for(int i=0 ; i<s.length() ; i++) {
			if(s.charAt(i)==' ') {
				c++;
			}
		}
		System.out.println(c);
	}

}
