package com.te.array;

public class TrippletSum {
	public static boolean trippletSum(int[] a, int sum) {
		for(int i=0 ; i<a.length ; i++) {
			for(int j=i+1 ; j<a.length ; j++) {
				for(int k=i+1 ; k<a.length ; k++) {
					if(a[i]+a[j]+a[k]==sum) {
						System.out.println(a[i] + " " + a[j] + " "+ a[k]);
						return true;
					}
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] a = {1,4,45,6,10,8};
		int sum = 22;
		trippletSum(a, sum);
	}

}
