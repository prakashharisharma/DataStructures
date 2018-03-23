package com.td.ds.arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3};
		int[] result = sortedArray(arr);
		for(int e : result) {
			System.out.println(e);
		}
	
	}
	
	static int[] sortedArray(int[] arr){
		int j=0;
		int i=1;
		while(i<arr.length) {
			if (arr[i] == arr[j]) {
				i++;
			} else {
				j++;
				arr[j] = arr[i];
				i++;
			}
		}
		int[] result = new int[j+1];
		System.arraycopy(arr, 0, result, 0, j+1);

		return result;
	}

	
}
