package com.td.ds.dp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CoinChange {
	public static void main(String[] args) {
        int[] coins = {1,2,5,10,20,50,100,200,500,2000};       
        int amt = 475;       
        makeChange(coins, amt); 
    }

    public static void makeChange(int[] coins, int amount){
        //Sorting the coins
        Arrays.sort(coins);

        int n = coins.length - 1;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        while(amount > 0)
        {
            if(coins[n] <= amount)
            {
                int val = 1;
                if(map.containsKey(coins[n]))
                {
                    val = map.get(coins[n]);
                    val = val+1;
                }

                map.put(coins[n], val);

                amount = amount - coins[n];

            }
            else
            {
                n--;
            }

        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){

            System.out.println(entry.getKey() +":" + entry.getValue());
        }
    }
}
