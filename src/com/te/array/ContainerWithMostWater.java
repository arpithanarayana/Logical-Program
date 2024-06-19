package com.te.array;

public class ContainerWithMostWater {
	public static int maxArea(int[] height) {
		int maxarea = 0;
		int left = 0;
		int right = height.length-1;
		
		while(left<right) {
			int currentArea = Math.min(height[left], height[right])* (right -left);
			maxarea = Math.max(maxarea, currentArea);
			if(height[left]<height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxarea;
	}
	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		int maxArea = maxArea(height);
		System.out.println(maxArea);
	}
}
