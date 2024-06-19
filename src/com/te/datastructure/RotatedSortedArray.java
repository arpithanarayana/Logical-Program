package com.te.datastructure;

public class RotatedSortedArray {
	public static int sort(int[] a, int key) {
		int l=0;
		int h= a.length-1;
		
		while(l<=h) {
			int mid = (l+h)/2;
			if(a[mid]==key) {
				return mid;
			}
			
			if(a[l]<=a[mid]) {
				if(a[l]<=key && key<=a[mid]) {
					h = mid - 1;
				} else {
					l = mid + 1;
				}
			} else {
				if(a[mid]<=key && key<=a[h]) {
					l = mid + 1;
				} else {
					h = mid - 1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a = {9,10,11,1,2,3,4,5,6,7,8};
		int key = 3;
		int index = sort(a, key);
		if(index!=-1) {
			System.out.println("key found at index: " + index);
		} else {
			System.out.println("key is not found");
		}
	}

}
