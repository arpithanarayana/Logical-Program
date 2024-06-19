package com.te.array;

import java.util.Arrays;

public class NearestSmaller {
	public static void main(String[] args) {
		int[] a = {3, 2, 1};
		int n = a.length;
		int[] b = new int[n];
		
		for(int i=0 ; i<n ; i++) {
			int nearestSmaller = -1;
			for(int j=i-1 ; j>=0 ; j--) {
				if(a[j]<a[i]) {
					nearestSmaller = a[j];
					break;
				}
			}
			b[i] = nearestSmaller;
		}
		System.out.println(Arrays.toString(b));
	}

}
