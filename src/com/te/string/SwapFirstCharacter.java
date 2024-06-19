package com.te.string;

public class SwapFirstCharacter {
	public static void main(String[] args) {
		String s1 = "add";
		String s2 = "egg";
		boolean flag = false;
		if(s1.length()!=s2.length()) {
			System.out.println(flag);
		} else {
			for(int i=0 ; i<s1.length() ; i++) {
				String temp = s1;
				s1 = s1.replace(s1.charAt(i), s2.charAt(i));
				s2 = s2.replace(s2.charAt(i), temp.charAt(i));
			}
		}
		System.out.println(s1);
		System.out.println(s2);
	}

}
