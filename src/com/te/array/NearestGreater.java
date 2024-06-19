package com.te.array;

import java.util.Arrays;

public class NearestGreater {
	public static void main(String[] args) {
		int[] a = { 4, 5, 2, 10 };
		int n = a.length;
		int[] b = new int[n];
		
		for(int i=0 ; i<a.length ; i++) {
			int nearestgreater = -1;
			for(int j=i+1 ; j<n ; j++) {
				if(a[j]>a[i]) {
					nearestgreater = a[j];
					break;
				}
			}
			b[i] = nearestgreater;
		}
		System.out.println(Arrays.toString(b));
	}

}
