package com.te.string;

public class PrintVowelsNotPresent {
	public static void main(String[] args) {
		String s = "hello";
		String ans = "";
		int a = 0, e=0, I=0, o=0, u=0;
		for(int i=0 ; i<s.length() ; i++) {
			char ch = s.charAt(i);
			if(ch=='a') a++;
			else if(ch=='e') e++;
			else if(ch=='i') I++;
			else if(ch=='o') o++;
			else if(ch=='u') u++;
		}
		if(a==0) {
			System.out.println('a');
		} if(e==0) {
			System.out.println('e');
		} if(I==0) {
			System.out.println('i');
		} if(o==0) {
			System.out.println('o');
		} if(u==0) {
			System.out.println('u');
		}
	}

}
