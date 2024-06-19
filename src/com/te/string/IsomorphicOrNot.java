package com.te.string;

public class IsomorphicOrNot {
	public static String iso(String s) {
		String ans = "";
		int c = 1;
		for(int i=0 ; i<s.length()-1 ; i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				c++; 
			} else {
				ans += c;
				c = 1;
			}
		}
		ans = ans + c;
		return ans;
	}
	public static void main(String[] args) {
		String s1 = "xxyyzz";
		String s2 = "aabbc";
		s1 = iso(s1);
		s2 = iso(s2);
		if(s1.equals(s2)) {
			System.out.println("isomorphic");
		} else {
			System.out.println("not a isomorphic");
		}
	}

}
