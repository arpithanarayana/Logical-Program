package com.te.array;

public class TrappingRainWater {
	public static int trap(int[] a) {
		int left =0;
		int right = a.length-1, leftmax =0, rightmax = 0;
		int trappedwater = 0;
		
		while(left<right) {
			if(a[left]<=a[right]) {
				if(a[left]>=leftmax) {
					leftmax = a[left];
				} else {
					trappedwater += leftmax - a[left];
				}
				left++;
			} else {
				if(a[right]>=rightmax) {
					rightmax = a[right];
				} else {
					trappedwater += rightmax - a[right];
				}
				right--;
			}
		}
		return trappedwater;
	}
	public static void main(String[] args) {
		int[] a = {1,3,4,5,6,7};
		int trap = trap(a);
		System.out.println(trap);
	}

}
