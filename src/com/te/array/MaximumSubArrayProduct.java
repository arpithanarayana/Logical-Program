package com.te.array;

/*
 * Given an array that contains both positive and negative integers, the task is to find the 
 * product of the maximum product subarray. 
 */

public class MaximumSubArrayProduct {
	public static int maximumSubarray(int[] a) {
		int res = a[0];
		for(int i=0 ; i<a.length ; i++) {
			int mul = a[i];
			for(int j=i+1 ; j<a.length ; j++) {
				mul *= a[j];
			}
			res = Math.max(res, mul);
		}
		
		return res;
	}
	public static void main(String[] args) {
		int[] a = { 1, -2, -3, 0, 7, -8, -2 };
		int maximumSubarray = maximumSubarray(a);
		System.out.println(maximumSubarray);
	}

}
