package com.te.array;

public class MissingElementInArray {
	public static void main(String[] args) {
		int[] a = {1, 4, 5, 3, 7, 8, 6};
		int sum1 = 0;
		for(int i=0 ; i<a.length ; i++) {
			sum1 = sum1 + a[i];
		}
		int sum2 = 0;
		for(int i=0 ; i<=a.length+1 ; i++) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2 - sum1);
	}

}
