package com.te.array;

public class SubArrayProgram {
	public static void subArray(int[] a) {
		for(int i=0 ; i<a.length ; i++) {
			for(int j=0 ; j<a.length ; j++) {
				for(int k=i ; k<=j ; k++) {
					System.out.print(a[k] + " ");
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {1,2,3};
		subArray(a);
	}

}
