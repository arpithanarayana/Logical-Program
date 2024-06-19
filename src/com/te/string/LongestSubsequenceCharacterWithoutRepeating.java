package com.te.string;

public class LongestSubsequenceCharacterWithoutRepeating {
	public static String longest(String s) {
		String longest = "";
		String occurrance = "";
		
		for(int i=0 ; i<s.length() ; i++) {
			occurrance = "" + s.charAt(i);
			for(int j=i+1 ; j<s.length() ; j++) {
				if(occurrance.indexOf(s.charAt(j))==-1) {
					occurrance += s.charAt(j);
				} else {
					break;
				}
			}
			if(occurrance.length() > longest.length()) {
				longest = occurrance;
			}
		}
		return longest;
	}
	public static void main(String[] args) {
		String s = "abcabcdef";
		String longest = longest(s);
		System.out.println(longest);
	}

}
