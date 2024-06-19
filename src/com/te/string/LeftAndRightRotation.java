package com.te.string;

public class LeftAndRightRotation {
	public static String leftRotation(String s, int k) {
	  String st = s.substring(k) + s.substring(0, k);
	  return st;
	}
	
	public static String rightRotation(String s, int k) {
		return leftRotation(s, s.length()-k);
	}
	public static void main(String[] args) {
		String s = "hello";
		int k = 2;
		String leftRotation = leftRotation(s, k);
		System.out.println(leftRotation);
		System.out.println("==========================");
		String rightRotation = rightRotation(s, k);
		System.out.println(rightRotation);
	}

}
