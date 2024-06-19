package com.te.string;

public class SubStringOfGivenString {
	public static void main(String[] args) {
		String s = "abc";
		for(int i=0 ; i<s.length() ; i++) {
			for(int j=i+1 ; j<s.length() ; j++) {
				String substring = s.substring(i, j);
				System.out.println(substring);
			}
		}
	}

}
