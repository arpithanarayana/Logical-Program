package com.te.array;

public class MergeAnArray {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {4,5,6};
		int c1 = a.length + b.length;
		int[] c = new int[c1];
		
		for(int i=0 ; i<a.length ; i++) {
			c[i] = a[i];
		}
		for(int j=0 ; j<b.length ; j++) {
			c[a.length+j] = b[j];
		}
		for(int i=0 ; i<c.length ; i++) {
			System.out.println(c[i]);
		}
	}

}
