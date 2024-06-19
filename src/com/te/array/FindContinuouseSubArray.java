package com.te.array;

public class FindContinuouseSubArray {
	public static void subarray(int[] a, int sum) {
		int currentsum = a[0];
		int start = 0;
		
		for(int end =1 ; end<a.length ; end++) {
			currentsum = currentsum + a[end];
			
			while(currentsum > sum && start<= end-1) {
				currentsum = currentsum - a[start];
				start++;
			}
			
			if(currentsum == sum) {
				for(int j=start ; j<=end ; j++) {
					System.out.print(a[j] + " ");
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {42, 15, 12, 8, 6, 32};
		int sum = 26;
		subarray(a, sum);
	}
}
