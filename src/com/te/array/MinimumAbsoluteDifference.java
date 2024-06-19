package com.te.array;

import java.util.Arrays;

public class MinimumAbsoluteDifference {
	public static void minimumAbs(int[] a) {
		Arrays.sort(a);
		int min = Math.abs(a[1]-a[0]);
		int first = a[0];
		int second = a[1];
		for(int i=2 ; i<a.length ; i++) {
			if(Math.abs(a[i]-a[i-1])<min) {
				min = Math.abs(a[i] - a[i-1]);
				first = a[i-1];
				second = a[i];
			}
		}
		System.out.println(first + " " + second);
	}
	public static void main(String[] args) {
		int[] a = {5, 8, 4, 2, 9, 0};
		minimumAbs(a);
	}

}
