package com.te.array;

public class CheckGivenArrayIdenticalOrNot {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {1,2,3};
		boolean flag = false;
		if(a.length != b.length) {
			flag = false;
		} else {
			for(int i=0 ; i<a.length ; i++) {
				if(a[i]==b[i]) {
					flag = true;
					break;
				}
			}
		}
		if(flag==true) {
			System.out.println("Arrays are identical");
		} else {
			System.out.println("Arrays are not identical");
		}
	}

}
