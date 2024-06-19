package com.te.datastructure;

public class QuickSort {
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static int partition(int[] a, int low, int high) {
		int pivot = a[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (a[j] <= pivot) {
				i++;
				swap(a, i, j);
			}
		}
		swap(a, i + 1, high);
		return i + 1;
	}

	public static void quickSort(int[] a, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(a, low, high);

			quickSort(a, low, pivotIndex - 1);
			quickSort(a, pivotIndex + 1, high);
		}
	}

	public static void quickSort(int[] a) {
		quickSort(a, 0, a.length - 1);
	}

	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 10, 7, 8, 9, 1, 5 };
		quickSort(arr);
		printArray(arr);
	}

}
