package com.te.datastructure;

public class BinarySearch {
	public static int binary(int[] a, int key) {
		int l=0;
		int h = a.length-1;
		while(l<=h) {
			int mid = (l+h)/2;
			if(a[mid]==key) {
				return mid;
			} else if(a[mid]<key) {
				l = mid+1;
			} else {
				h = mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int key = 3;
		int binary = binary(a, key);
		System.out.println(binary);
	}

}
