package com.td.ds.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {5,2,9,1,3,4};
		print(arr);
		sort(arr);
		print(arr);
	}
	
	private static void sort(int[] arr) {
		
		for(int i=arr.length ; i > 0; i--) {
			for(int j=0; j<i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		}
		
	}
	
	private static void print(int[] arr) {
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
	
	
}
