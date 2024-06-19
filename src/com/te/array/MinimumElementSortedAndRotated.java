package com.te.array;

/*
 * Given a sorted array arr[] (may be distinct or may contain duplicates) of size N that is rotated 
 * at some unknown point, the task is to find the minimum element in it. 
 */

public class MinimumElementSortedAndRotated {
	public static int minimum(int[] a) {
		int min = a[0];
		for(int i=0 ; i<a.length ; i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int[] a = {5, 6, 1, 2, 3, 4};
		System.out.println(minimum(a));
	}

}
