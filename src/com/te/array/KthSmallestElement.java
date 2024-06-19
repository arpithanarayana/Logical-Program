package com.te.array;

import java.util.Arrays;

public class KthSmallestElement {
	public static int kthSmallest(Integer[] a, int k) {
		Arrays.sort(a);
		return a[k-1];
	}
	public static void main(String[] args) {
		Integer[] a = new Integer[] {3,2,1,5,6,4};
		int k = 2;
		int kthSmallest = kthSmallest(a, k);
		System.out.println(kthSmallest);
	}
}
