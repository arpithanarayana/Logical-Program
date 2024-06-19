package com.te.array;

import java.util.HashSet;

public class LongestSubsequenceWithoutRepeating {
	public static int longest(int[] a) {
		HashSet<Integer> set = new HashSet<>();
		int start = 0;
		int maxlength = 0;
		
		for(int end = 0; end<a.length ; end++) {
			while(set.contains(a[end])) {
				set.remove(a[start]);
				start++;
			}
			set.add(a[end]);
			maxlength = Math.max(maxlength, end-start+1);
		}
		return maxlength;
	}
	public static void main(String[] args) {
		int[] a = { 3, 1, 3, 3, 5, 6, 2, 2, 4, 8, 2, 2 };
		int longest = longest(a);
		System.out.println(longest);
	}

}
