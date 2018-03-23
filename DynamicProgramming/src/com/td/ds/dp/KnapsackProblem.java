package com.td.ds.dp;

public class KnapsackProblem {

	public static void main(String[] args) {

		int knapsackMaxWeight = 5;
		int itemValue[] = { 200, 240, 140, 150 };
		int itemWeight[] = { 1, 3, 2, 5 };

		int maxProfit = maximizeProfit(itemWeight, itemValue, knapsackMaxWeight);
		
		System.out.println("MAX PROFIT\t: " + maxProfit);

	}

	private static int maximizeProfit(int[] itemWeight, int[] itemValue, int knapsackMaxWeight) {

		int[][] temp = new int[itemWeight.length + 1][knapsackMaxWeight + 1];

		for (int row = 0; row <= itemWeight.length; row++) {
			for (int col = 0; col <= knapsackMaxWeight; col++) {

				// Represent 0 item OR Sack with capacity 0
				if (row == 0 || col == 0) {
					continue;
				}

				// If col represent Sack weight and if it is >= item weight,
				// it means item is eligible to be picked.
				if (col >= itemWeight[row - 1]) {

					// Checking picking the item will give Max profit or not picking the item will
					// give Max profit.
					temp[row][col] = Math.max(itemValue[row - 1] + temp[row - 1][col - itemWeight[row - 1]],
							temp[row - 1][col]);
				} else {

					// Sack weight is less than item weight, So can't pick item and Max profit we
					// can get at this point is profit we got in previous step by not picking
					// current item
					temp[row][col] = temp[row - 1][col];
				}
			}
		}

		System.out.println("DYNAMIC PROGRAMMING TABLE");
		System.out.println("-----------------------------------");
		for (int i = 0; i < itemWeight.length; i++) {
			for (int j = 0; j < knapsackMaxWeight; j++) {
				System.out.print(temp[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");

		System.out.print("SELECTED ITEMS\t: ");
		int i = temp.length - 1;
		int j = knapsackMaxWeight;
		int k = 0;
		while (i > 0) {
			k = temp[i][j];
			if (k != temp[i - 1][j]) {

				System.out.print(itemValue[i - 1] + " ");
				j -= itemWeight[i - 1];
			}
			i -= 1;
		}

		System.out.println();
		System.out.println("-----------------------------------");
		return temp[itemWeight.length][knapsackMaxWeight];
	}
}
