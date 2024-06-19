package com.te.string;

import java.util.Arrays;

/*
 * write a program output should be returned true, if the string is an empty string or null return 
 * false if the string contains a character or word in it.
 * i/p = {"",null, "", "hello"}
 * o/p = {true,true, true, false}
 *  
 */

public class StringProgram {
	public static boolean[] checkEmpty(String[] s) {
		boolean[] input = new boolean[s.length];
		for(int i=0 ; i<s.length ; i++) {
			if(s[i]=="" || s[i]==null) {
				input[i] = true;
			} else {
				input[i] = false;
			}
		}
		return input;
	}
	public static void main(String[] args) {
		String[] input = {"", null, "", "hello"};
		boolean[] checkEmpty = checkEmpty(input);
		System.out.println(Arrays.toString(checkEmpty));
	}
}
