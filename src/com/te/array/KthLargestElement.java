package com.te.array;

import java.util.Arrays;

public class KthLargestElement {
	public static int kthLargest(Integer[] a, int k) {
		Arrays.sort(a);
		return a[a.length-k];
	}
	public static void main(String[] args) {
		Integer[] a = new Integer[] {3,2,1,5,6,4};
		int k = 3;
		int kthLargest = kthLargest(a, k);
		System.out.println(kthLargest);
	}

}
