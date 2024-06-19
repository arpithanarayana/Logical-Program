package com.te.array;

public class MinimumElementInArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		int max1 = Integer.MAX_VALUE;
		for(int i=0 ; i<a.length ; i++) {
			if(a[i]<max1) {
				max1 = a[i];
			}
		}
		System.out.println(max1);
		
		int max2 = Integer.MAX_VALUE;
		for(int i=0 ; i<a.length ; i++) {
			if(a[i]<max2 && a[i]>max1) {
				max2 = a[i];
			}
		}
		System.out.println(max2);
		
		int max3 = Integer.MAX_VALUE;
		for(int i=0 ; i<a.length ; i++) {
			if(a[i]<max3 && a[i]>max2) {
				max3 = a[i];
			}
		}
		System.out.println(max3);
	}

}
