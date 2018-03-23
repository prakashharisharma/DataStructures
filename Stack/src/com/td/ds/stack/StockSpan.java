package com.td.ds.stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		int[] stck = {100,80,60,70,60,75,85};
		int[] span = stockSpan(stck);
		
		for(int i: span) {
			System.out.print(i +",");
		}
	}
	
	public static int[] stockSpan(int[] stock) {
        // we will use stack for indexes and not for "stock values"
        final Stack<Integer> stack = new Stack<Integer>();
        
        int[] span = new int[stock.length];

        for (int i = 0; i < stock.length; i++) {
            int index = 0;
            span[i] = 1;
            while (!stack.isEmpty() && stock[stack.peek()] <= stock[i]) {
                index = stack.pop();
                span[i] = i - index + span[index];
            }
            
            stack.push(i);
        }

        return span;
    }
}
