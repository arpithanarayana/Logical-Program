package com.te.datastructure;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = {1,3,2,5,4};
		for(int i=0 ; i<a.length-1 ; i++) {
			int m = i;
			for(int j=i+1 ; j<a.length ; j++) {
				if(a[j]>a[m]) {
					m = j;
				}
				int temp = a[m];
				a[m] = a[j];
				a[j] = temp;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
