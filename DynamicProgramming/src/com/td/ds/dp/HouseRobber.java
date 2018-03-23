package com.td.ds.dp;

public class HouseRobber {

	 public int steal(int[] num) {
	        if(num==null || num.length==0){
	            return 0;
	        }
	        int[] dp= new int[num.length+1];
	        dp[0]=0;
	        dp[1]=num[0];
	        for(int i=2; i<=num.length;i++){
	            dp[i] =Math.max(dp[i-1],num[i-1]+dp[i-2]);
	        }
	        
	        return dp[num.length];
	    }
	
	 public static void main(String[] args) {
		 HouseRobber hr = new HouseRobber();
		 
		 int[] houses = {1,6,26,3,5};
		 
		 int result = hr.steal(houses);
		 
		 System.out.println("HouseRobber.main()" + result);
		 
	}
}
