package com.te.string;

public class RemoveDuplicateCharacter {
	public static void main(String[] args) {
		String s1 = "abcabcef";
		String s2 = "";
		for(int i=0 ; i<s1.length() ; i++) {
			char ch = s1.charAt(i);
			if(s2.indexOf(ch)<0) {
				s2 = s2 + ch;
			}
		}
		System.out.println(s1);
		System.out.println(s2);
	}

}
