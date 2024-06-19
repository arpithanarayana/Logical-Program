package com.te.string;

public class StringPanagramOrNot {
	public static boolean pangram(String s) {
		if(s.length()<26) {
			return false;
		} else {
			for(char ch = 'a' ; ch<='z' ; ch++) {
				if(s.indexOf(ch)<0) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String s = "abcdef";
		boolean pangram = pangram(s);
		System.out.println(pangram);
	}

}
