package com.te.array;

public class SubArrayWithGivenSum {
	public static void subArray(int[] a, int sum) {
		for(int i=0 ; i<a.length ; i++) {
			int current = a[i];
			if(current==sum) {
				System.out.println(i + " ");
			} else {
				for(int j=i+1 ; j<a.length ; j++) {
					current += a[j];
					if(current == sum) {
						System.out.println(i + " " + j);
						return;
					}
				}
			}
		}
		System.out.println("no element is found");
	}
	public static void main(String[] args) {
		int[] a = {15,2,4,8,9,5,10,23};
		int sum = 23;
		subArray(a, sum);
	}

}
