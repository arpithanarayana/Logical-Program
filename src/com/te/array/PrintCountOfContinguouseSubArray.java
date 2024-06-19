package com.te.array;

public class PrintCountOfContinguouseSubArray {
	public static int longest(int[] a) {
		if(a==null || a.length ==0) {
			return 0;
		}
		if(a.length ==1) {
			return 1;
		}
		int maxlen= 1;
		int inclen = 1;
		int declen = 1;
		
		for(int i=1 ; i<a.length ; i++) {
			if(a[i]>=a[i-1]) {
				inclen ++;
			} else {
				inclen = 1;
			}
			
			if(a[i]<= a[i-1]) {
				declen ++;
			} else {
				declen = 1;
			}
			maxlen = Math.max(maxlen, Math.max(inclen, declen));
		}
		return maxlen;
	}
	public static void main(String[] args) {
		int[] a1 = { 1, 3, 5, 4, 2, 1, 1, 2 };
		int[] a2 = { 7, 3, 2, 2, 2, 1, 4, 5 };
		int[] a3 = { 1, 2, 3, 4, 5 };
		System.out.println(longest(a1));
		System.out.println(longest(a2));
		System.out.println(longest(a3));
	}

}
