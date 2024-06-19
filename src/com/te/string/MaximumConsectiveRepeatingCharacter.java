package com.te.string;

public class MaximumConsectiveRepeatingCharacter {
	public static char maximum(String s) {
		int count = 0;
		int maxcount = 0;
		char res = s.charAt(0);
		
		for(int i=0 ; i<s.length()-1 ; i++) {
			if(s.charAt(i)==s.charAt(i+1) && i<s.length()-1) {
				maxcount++;
			} else {
				if(maxcount>count) {
					count = maxcount;
					res = s.charAt(i);
				}
				maxcount = 1;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		String s = "greeks";
		char maximum = maximum(s);
		System.out.println(maximum);
	}

}
