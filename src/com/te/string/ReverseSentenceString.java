package com.te.string;

public class ReverseSentenceString {
	public static void main(String[] args) {
		String s1 = "i love java";
		String s2 = "";
		String[] word = s1.split(" ");
		
		for(int i= 0 ; i<word.length ; i++) {
			if(i==word.length-1) {
				s2 = word[i] + s2;
			} else {
				s2 = " " + word[i] + s2;
			}
		}
		System.out.println(s1);
		System.out.println(s2);
	}

}
