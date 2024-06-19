package com.te.array;

public class KadanesAlgorithm {
	public static int findMax(int[] a) {
		int maxfar = 0;
		int maxend = 0;
		
		for(int i=0 ; i<a.length ; i++) {
			maxend = Math.max(a[i], a[i]+maxend);
			maxfar = Math.max(maxend, maxfar);
		}
		return maxend;
	}
	public static void main(String[] args) {
		int[] a = {-2, -3, 4, -1, -2, 1 , 5 ,-3}; 
		int findMax = findMax(a);
		System.out.println(findMax);
	}
}
