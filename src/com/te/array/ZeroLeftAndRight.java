package com.te.array;

public class ZeroLeftAndRight {
	public static void main(String[] args) {
		int[] a = {1,2,0,0,3,0,5,0,0};
		for(int ele: a) {
			if(ele==0) {
				System.out.print(ele + " ");
			}
		}
		for(int ele: a) {
			if(ele!=0) {
				System.out.print(ele + " ");
			}
		}
	}

}
