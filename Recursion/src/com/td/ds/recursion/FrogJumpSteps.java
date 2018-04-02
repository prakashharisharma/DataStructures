package com.td.ds.recursion;

public class FrogJumpSteps {

	public static void main(String[] args) {
		int x = 10, y = 85, d = 30;

		int result = jumpsCount(x, y, d);

		System.out.println(result);
		

	}

	private static int jumpsCount(int x, int y, int d) {
		if ((y - x) % d == 0) {
			return (y - x) / d;
		} else {
			return (y - x) / d + 1;
		}
	}

}
