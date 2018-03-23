package com.td.ds.sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = { 5, 2, 9, 1, 3, 4 };
		print(arr);
		sort(arr);
		print(arr);
	}

	private static void sort(int[] arr) {

		for (int i = 1; i < arr.length; ++i) {
			int key = arr[i];
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}

	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
