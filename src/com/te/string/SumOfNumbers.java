package com.te.string;

public class SumOfNumbers {
	public static void main(String[] args) {
		String s1 = "abc123";
		int sum = 0;
		for(int i=0 ; i<s1.length() ; i++) {
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9') {
			    sum = sum + (s1.charAt(i)-48);	
			}
		}
		System.out.println(sum);
	}

}
