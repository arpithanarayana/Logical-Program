package com.te.array;

public class SubArrayWithZeroSum {
	public static boolean sum(int[] a) {
		int n = a.length;
		
		for(int i=0 ; i<n ; i++) {
			int sum = a[i];
			if(sum==0) {
				return true;
			}
				for(int j=i+1 ; j<n ; j++) 
					sum += a[j];
				if(sum == 0)
					return true;
			}
		return false;
	}
	public static void main(String[] args) {
		int[] a = {-3,2,1,6};
		boolean isSum = sum(a);
		if(isSum) {
			System.out.println("zero sum is present");
		} else {
			System.out.println("no zero sum is present");
		}
	}
}
