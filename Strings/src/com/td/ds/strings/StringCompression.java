package com.td.ds.strings;

public class StringCompression {
	public static void main(String[] args) {
		String str = "abcdeeeeeeeefffffg";
		//a1b1c1d1e8f5g1
		char[] a = compressString(str);
		System.out.println(a);
	}

	public static char[] compressString(String str) {
		char[] arr = str.toCharArray();

		// First scan
		// In this scan we will update count for characters which appears more then
		// once, leaving
		// characters which occur only once
		for (int i = 0; i < arr.length - 1; i++) {
			char c = arr[i];

			// Start searching from next character till it matches arr[i].
			int j = i + 1;

			// Check if next character is same as previous character, If yes, then continue
			// until you found different character and replace same character with space.
			while (j < arr.length && arr[j] == c) {
				arr[j] = ' ';
				j++;
			}

			// Check whether next character is same or different by looking at position of
			// j.
			// if j position is i+1 from where we initialize, then next character is
			// different.
			// if j position is not i+1, then there are consecutive matching characters till
			// j position.
			// Replace next position of i that is i+1 with count of arr[i].
			if (j != i + 1) {
				arr[i + 1] = String.valueOf(j - i).toCharArray()[0];
				i = j - 1;
			}
		}

		// Second scan
		// In this scan we will start working on characters which appears once.
		// If there is no space for writing count, then make space for writing count by
		// shifting all characters till
		// all characters are properly shifted.
		for (int i = 0; i < arr.length - 1; i++) {

			// Check the item at position arr[i] is number or character.
			if (arr[i] >= 'a' && arr[i] <= 'z') {
				// it is character

				// Check next character is number or character,
				// if it is character then only we need to insert 1 in between.
				// If it is number then (character and respective count) are at correct
				// position, so don't do anything.
				if (arr[i + 1] >= 'a' && arr[i + 1] <= 'z') {
					// item at next position is character, so need to insert 1 in between.
					// Shift all characters till all characters are shifted (until we found first
					// space to accommodate all shifts)

					int j = i;
					char temp = arr[j + 1];
					char workingOn = arr[j];

					// Shift all characters until space is not found.
					while (temp != ' ') {
						arr[++j] = workingOn;
						workingOn = temp;
						temp = arr[j + 1];
					}
					arr[j + 1] = workingOn;

					// Update i+1 position with count of arr[i] character.
					arr[i + 1] = String.valueOf(1).toCharArray()[0];
				}

				// STEP 1:If character is space, then find first character ahead and shift that
				// character to starting space.
				// STEP 2:Before shifting, check next character of first character found in STEP
				// 1. if it is number directly shift it.
				// if it is alphabet, then add 1.
			} else if (arr[i] == ' ') {
				// it is space, so check position where first character is encountered after
				// space.

				int j = i + 1;
				while (j < arr.length && arr[j] == ' ') {
					j++;
				}

				// wherever j is stopped at that position character is encountered.
				// Check that we doesn't reached end position.
				// If j is less then end position, then replace position at i which was space
				// with first character
				// encountered, and check count of that character.
				if (j < arr.length) {

					// Replace position of character i with character at j.
					arr[i] = arr[j];

					// Character at j is put at i, so character at j is replaced with space.
					arr[j] = ' ';

					// Check next character of character which we moved,
					// if next item is character it means, count for that character is 1, so write 1
					// to next position
					// if next item is count it means, count is already present and we just need to
					// write that to next position
					if (j + 1 < arr.length) {
						if (arr[j + 1] >= 'a' && arr[j + 1] <= 'z') {
							arr[i + 1] = String.valueOf(1).toCharArray()[0];
						} else {
							arr[i + 1] = arr[j + 1];
						}
						arr[j] = ' ';
						arr[j + 1] = ' ';
					} else {
						arr[i + 1] = String.valueOf(1).toCharArray()[0];
					}
				}
			}
		}

		// Remove extra spaces if required here.
		return arr;
	}
}
