package com.te.array;

public class FirstRepeatingElementInArray {
	public static int firstRepeatingElement(int[] a) {
		for(int i=0 ; i<a.length ; i++) {
			for(int j=i+1 ; j<a.length ; j++) {
				if(a[i]==a[j]) {
					return i;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a = {10,5,3,4,3,5,6};
		int index = firstRepeatingElement(a);
		if(index!=-1) {
			System.out.println(a[index]);
		} else {
			System.out.println("no elemenet is found");
		}
	}
}
