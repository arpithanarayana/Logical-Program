package com.te.array;

/*
 * Given an array A[] of n numbers and another number x, the task is to check whether or 
 * not there exist two elements in A[] whose sum is exactly x. 

   Examples: 
   Input: arr[] = {0, -1, 2, -3, 1}, x= -2
   Output: Yes
   Explanation: If we calculate the sum of the output,1 + (-3) = -2
   Input: arr[] = {1, -2, 1, 0, 5}, x = 0
   Output: No
 */
public class CheckGivenSumExistsOrNot {
	public static boolean check(int[] a, int sum) {
		for(int i=0 ; i<a.length ; i++) {
			for(int j=i+1 ; j<a.length ; j++) {
				if(a[i]+a[j]==sum) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] a = {0,-1,2,-3,1};
		int sum = -8;
		boolean check = check(a, sum);
		if(check) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
