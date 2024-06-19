package com.te.array;

public class FirstNonRepeatingElementInArray {
	public static int firstNonRepeating(int[] a) {
		for(int i=0 ; i<a.length ;i++) {
			int j;
			for(j=0 ; j<a.length ; j++) {
				if(a[i]==a[j] && i!=j) {
					break;
				}
			}
			if(j==a.length) {
				return a[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a = {9,4,9,6,7,4};
		int firstNonRepeating = firstNonRepeating(a);
		System.out.println(firstNonRepeating);
	}

}
