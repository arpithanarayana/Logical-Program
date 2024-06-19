package com.te.array;

import java.util.ArrayList;
import java.util.List;

public class PrintAllContiguouseSubArray {
	public static List<Integer> extractSubArray(int[] a, int start, int end){
		List<Integer> list = new ArrayList<>();
		for(int i=start ; i<=end ; i++) {
			list.add(a[i]);
		}
		return list;
	}
	public static List<List<Integer>> subarray(int[] a, int sum){
		List<List<Integer>> result = new ArrayList<>();
		for(int i=0 ; i<a.length ; i++) {
			int current = 0;
			for(int j=i ; j<a.length ; j++) {
				current+= a[j];
				if(current==sum) {
					result.add(extractSubArray(a, i,j));
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] a = {2, 4, 2, 8, 3, 3, 2, -4, 12};
		int sum = 8;
		List<List<Integer>> subArray = subarray(a, sum);
		System.out.println(subArray);
	}

}
