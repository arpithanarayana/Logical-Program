package com.te.datastructure;

/*
 * First Occurrance of the element in array by using binary search
 */

public class FirstOccurranceOfElement {
	public static int firstOccurrance(int[] a, int key) {
		int l=0;
		int h = a.length-1;
		int result = -1;
		
		while(l<=h) {
			int mid = (l+h)/2;
			if(a[mid]==key) {
				result = mid;
				h = mid-1;
			} else if(a[mid]<key) {
				l = mid+1;
			} else {
				h = mid-1;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] a = {1,2,2,3,3,3,4,5,6};
		int key = 3;
		int firstOccurrance = firstOccurrance(a, key);
		System.out.println(firstOccurrance);
	}

}
