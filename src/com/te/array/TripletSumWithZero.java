package com.te.array;

/*
 * Given an array of distinct elements. The task is to find triplets in the array whose sum is zero.
 */
public class TripletSumWithZero {
	public static void sum(int[] a) {
		for(int i=0 ; i<a.length ; i++) {
			if(a[i]+a[i+1]+a[i+2]==0) {
				System.out.println(a[i] + " " + a[i+1] + " " + a[i+2]);
				return;
			}
		}
		System.out.println("element does not exists");
	}
	
	public static void tripletSum(int[] a) {
		boolean flag = false;
		for(int i=0 ; i<a.length-2 ; i++) {
			for(int j=i+1 ; j<a.length-1 ; j++) {
				for(int k = j+1 ; k<a.length ; k++) {
					if(a[i]+a[j]+a[k]==0) {
					System.out.println(a[i] + " " + a[j] + " " + a[k]);
					flag = true;
					}
				}
			}
		}
		if(flag == false) {
			System.out.println("no element is found");
		}
	}
	
	public static void triplet(int[] a) {
		boolean flag = false;
		for(int i=0 ; i<a.length ; i++) {
			for(int j=i ; j<a.length ; j++) {
				for(int k=i+1; k<=j ; k++) {
					if(a[i]+a[j]+a[k]==0) {
						System.out.println(a[i] + " " + a[j] + " " + a[k]);
						flag = true;
					}
				}
			}
		}
		if(flag == false) {
			System.out.println("no element is found");
		}
	}
	public static void main(String[] args) {
		int[] a = {0, -1, 2, -3, 1};
		sum(a);
		
		System.out.println("======================================");
		
		tripletSum(a);
		
		System.out.println("======================================");
		
		triplet(a);
		
	}
}
