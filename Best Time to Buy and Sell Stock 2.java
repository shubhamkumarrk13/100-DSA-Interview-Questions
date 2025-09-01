// Problem Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/

class Solution {

    public int maxProfit(int[] prices) {

        int n = prices.length;

        int maxProfit = 0;

        for(int i=0; i<n-1; i++) {

            if(prices[i+1] > prices[i]) {

                maxProfit = maxProfit + (prices[i+1] - prices[i]);
            }
        }

        return maxProfit;
        
    }
}
