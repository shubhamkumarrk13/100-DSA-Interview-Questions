// Problem Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

class Solution {

    public int maxProfit(int[] prices) {

        int maxProfit = 0;

        int cost = prices[0];

        for(int i=0 ; i<prices.length ; i++) {

            int profit = prices[i] - cost;

            maxProfit = Math.max(maxProfit, profit);

            if(prices[i] < cost) cost = prices[i];
        }
        
        return maxProfit;
    }
}
