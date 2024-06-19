package com.te.array;

/*
 * Given an array prices[] of length N, representing the prices of the stocks on different days, 
 * the task is to find the maximum profit possible by buying and selling the stocks on different 
 * days when at most one transaction is allowed.

   Note: Stock must be bought before being sold.

   Examples:
   Input: prices[] = {7, 1, 5, 3, 6, 4}
   Output: 5
   
   Input: prices[] = {7, 6, 4, 3, 1} 
   Output: 0
 */
public class TimeToBuyAndSell {
	public static int maxProfit(int[] a) {
		int buy = a[0], maxProfit=0;
		for(int i=0 ; i<a.length ; i++) {
			if(buy>a[i]) {
				buy = a[i];
			} else if(a[i]-buy>maxProfit) {
				maxProfit = a[i] - buy;
			}
		}
		return maxProfit;
	}
	public static void main(String[] args) {
		int[] a = {7,1,5,3,6,4};
		int maxProfit = maxProfit(a);
		System.out.println(maxProfit);
	}

}
