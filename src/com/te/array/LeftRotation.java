package com.te.array;

import java.util.Arrays;

public class LeftRotation {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int d = 3;
		for(int i=0 ; i<d ; i++) {
			int first = a[0];
			for(int j=0 ; j<a.length-1 ; j++) {
				a[j] = a[j+1];
			}
			a[a.length-1] = first;
		}
		System.out.println(Arrays.toString(a));
	}

}
