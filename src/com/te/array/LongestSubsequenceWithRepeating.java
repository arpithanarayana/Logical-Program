package com.te.array;

public class LongestSubsequenceWithRepeating {
	public static int longest(int[] a) {
		int currentcount = 0;
		int maxcount = 0;
	
		for(int i=1 ; i<a.length ; i++) {
			if(a[i]==a[i-1]) {
				currentcount++;
			} else {
				currentcount = 1;
			}
			maxcount = Math.max(maxcount, currentcount);
		}
		return maxcount;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 4, 2, 2,  5};
		System.out.println(longest(arr));
	}

}
