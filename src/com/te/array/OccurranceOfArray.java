package com.te.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OccurranceOfArray {
	public static void arrayCount(int[] a) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i : a) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			} else {
				map.put(i, 1);
			}
		}
		System.out.println(map);
	}
	public static void main(String[] args) {
		int[] a = {4, 5, 4, 5, 4, 6};
		arrayCount(a);
//		Arrays.sort(a);
//		for(int i=0 ; i<a.length ; i++) {
//			int c=1;
//			for(int j = i+1 ; j<a.length ; j++) {
//				if(a[i]==a[j]) {
//					c++;
//				} 
//			}
//			System.out.println(a[i] + "-->" + c);
//			i +=(c-1);
//		}
	}

}
