package com.te.array;

public class FindAllLeaders {
	public static void leader(int[] a) {
		int max = a[a.length-1];
		System.out.println(a[a.length-1]);
		for(int i=a.length-2 ; i>=0 ; i--) {
			if(a[i]>max) {
				System.out.println(a[i]);
				max = a[i];
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {12, 9, 7, 14, 8, 6, 3};
		leader(a);
	}

}
