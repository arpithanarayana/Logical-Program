package com.te.string;

public class RotationOfString {
	public static boolean rotation(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		String s3 = s1 + s1;
		if(s3.contains(s2)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hii";
		boolean isRotation = rotation(s1, s2);
		if(isRotation) {
			System.out.println("string is rotated");
		} else {
			System.out.println("not");
		}
	}
}
