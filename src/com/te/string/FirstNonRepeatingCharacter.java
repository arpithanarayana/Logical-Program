package com.te.string;

public class FirstNonRepeatingCharacter {
	public static char nonRepeating(String s) {
		char[] count = new char[256];
		for(int i=0 ; i<s.length() ; i++) {
			count[s.charAt(i)]++;
		}
		for(int i=0 ; i<s.length() ; i++) {
			if(count[s.charAt(i)]==1) {
				return s.charAt(i);
			}
		}
		return '\0';
	}
	public static void main(String[] args) {
		String s = "java";
		char nonRepeating = nonRepeating(s);
		System.out.println(nonRepeating);
	}

}
