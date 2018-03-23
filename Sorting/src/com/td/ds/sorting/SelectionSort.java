package com.td.ds.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 5, 2, 9, 1, 3, 4 };
		print(arr);
		sort(arr);
		print(arr);
	}

	private static void sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
