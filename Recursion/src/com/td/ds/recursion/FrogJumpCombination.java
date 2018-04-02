package com.td.ds.recursion;

public class FrogJumpCombination {

	public static void main(String[] args) {

		int result = jumpCombiniation(3);

		System.out.println(result);
		
	}
	
	private static int jumpCombiniation(int distance) {
		if(distance==1)
			return 1;
		else if(distance==2)
			return 2;
		else
			return jumpCombiniation(distance-1)+jumpCombiniation(distance-2);
	}
	
}
