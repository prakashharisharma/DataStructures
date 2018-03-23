package com.td.ds.recursion;

public class BracesCombination {

	public static void main(String[] args) {
		BracesCombination bc = new BracesCombination();

		bc.print(3);

	}

	public void print(int n) {
		print("", n, n);
	}

	public void print(String s, int open, int close) {

		System.out.println("S"+s +" "+"Open" +open+" "+"CLose"+close);
		
		if (open > close)
			return;
		if (open == 0 && close == 0) {
			System.out.println(s);
			return;
		}

		if (open < 0 || close < 0) {
			return;
		}

		print(s + "{", open - 1, close);
		print(s + "}", open, close - 1);

	}
}
