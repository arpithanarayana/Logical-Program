package com.te.array;

public class LengthOfLongestSubsequenceOfArray {
	public static int longest(int[] a) {
		int n = a.length;
		int[] lis = new int[n];
		for(int i=0 ; i<a.length ; i++) {
			lis[i] = 1;
		}
		
		for(int i=1 ; i<a.length ; i++) {
			for(int j=0 ; j<i ; j++) {
				if(a[i]>a[j] && lis[i]<lis[j]+1) {
					lis[i] = lis[j] + 1;
				}
			}
		}
		int max = 0;
		for(int i= 0 ; i<n ; i++) {
			if(max<lis[i]) {
				max = lis[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] a = {10,22,9,33,21,50,41,60,80};
		int longest = longest(a);
		System.out.println(longest);
	}

}
