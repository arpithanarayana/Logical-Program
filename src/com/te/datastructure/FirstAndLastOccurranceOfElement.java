package com.te.datastructure;

/*
 * Print the first and last occrrance of the element which is repeated in array by using binary search.
 */

public class FirstAndLastOccurranceOfElement {
	public static int occurrance(int[] a, int key, boolean isOccurrance) {
		int l=0;
		int h = a.length-1;
		int result = -1;
		while(l<=h) {
			int mid = (l+h)/2;
			if(a[mid]==key) {
				result = mid;
				if(isOccurrance) {
					h = mid - 1;
 				} else {
 					l = mid+1;
 				}
			} else if(a[mid]<key) {
				l = mid + 1;
			} else {
				h = mid - 1;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,3,3,3,3,4,5,6};
		int key = 3;
		int first = occurrance(a, key, true);
		int last = occurrance(a, key, false);
		System.out.println(first + " " + last);
	}

}
