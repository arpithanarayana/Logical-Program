package com.te.array;

public class MaximumElementInArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int max1 = Integer.MIN_VALUE;
		for(int i=0 ; i<a.length ; i++) {
			if(max1<a[i]) {
				max1 = a[i];
			}
		}
		System.out.println(max1);
		
		int max2 = Integer.MIN_VALUE;
		for(int i=0 ; i<a.length ; i++) {
			if(max2<a[i] && a[i]!=max1) {
				max2 = a[i];
			}
		}
		System.out.println(max2);
		
		int max3 = Integer.MIN_VALUE;
		for(int i=0 ; i<a.length ; i++) {
			if(max3<a[i] && a[i]!=max2 && a[i]!=max1) {
				max3 = a[i];
			}
		}
		System.out.println(max3);
	}

}
