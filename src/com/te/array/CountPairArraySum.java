package com.te.array;

public class CountPairArraySum {
	public static void main(String[] args) {
		int[] a = {1,5,7,-1};
		int sum = 6;
		int c=0;
		for(int i=0 ; i<a.length ; i++) {
			for(int j=i+1 ; j<a.length ; j++) {
				if(a[i]+a[j]==sum) {
					c++;
				}
			}
		}
		System.out.println(c);
	}
}
