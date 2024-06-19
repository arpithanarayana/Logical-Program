package com.te.string;

public class PrintAllPermutation {
	public static void permutation(String s) {
		permutation("" , s);
	}
	public static void permutation(String per, String input) {
		if(input.length()==0) {
			System.out.println(per);
		} else {
			for(int i=0 ; i<input.length() ; i++) {
				permutation(per+input.charAt(i), input.substring(0, i)+ input.substring(i+1, input.length()));
			}
		}
	}
	public static void main(String[] args) {
		String s = "abc";
		permutation(s);
	}

}
