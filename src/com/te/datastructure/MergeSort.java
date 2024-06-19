package com.te.datastructure;

import java.util.Arrays;

public class MergeSort {
	public static void merge(int[] a, int[] temp, int left, int mid, int right) {
		int i = left;
		int j = mid+1;
		int k = left;
		
		while(i<=mid && j<=right) {
			if(a[i]<=a[j]) {
				temp[k++] = a[i++];
			} else {
				temp[k++] = a[j++];
			}
		}
		while(i<=mid) {
			temp[k++] = a[i++];
		}
		while(j<=right) {
			temp[k++] = a[j++];
		}
		for(int l=left ; l<=right ; l++) {
			a[l] = temp[l];
		}
	}
	public static void mergeSort(int[] a, int[] temp, int left, int right) {
		if(left< right) {
			int mid = left + (right-left)/2 ;
			mergeSort(a, temp, left, mid);
			mergeSort(a, temp, mid+1, right);
			merge(a, temp, left, mid, right);
		}
	}
	public static void mergeSort(int[] a) {
		if(a ==null || a.length ==0) {
			return;
		}
		int[] temp = new int[a.length];
		mergeSort(a, temp, 0, a.length-1);
	}
	public static void main(String[] args) {
		int[] a = {1,3,2,5,4};
		mergeSort(a);
		System.out.println(Arrays.toString(a));
	}

}
