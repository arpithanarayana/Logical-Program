package com.te.string;

public class RemoveExtraSpace {
	public static void main(String[] args) {
		String s1 = "hello  hii   byee";
		String s2 = "";
		for(int i=0 ; i<s1.length()-1 ; i++) {
			if(s1.charAt(i)==' ' && s1.charAt(i+1)==' ') {
				continue;
			}
			s2 = s2 + s1.charAt(i);
		}
		System.out.println(s1);
		System.out.println(s2);
	}

}
