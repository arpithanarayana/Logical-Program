package com.te.datastructure;

public class LinearSearch {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int key = 3;
		boolean flag = false;
		for(int i=0 ; i<a.length ; i++) {
			if(a[i]==key) {
				System.out.println(i);
				flag = true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("the element is not found");
		}
	}

}
