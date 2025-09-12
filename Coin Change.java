// Problem Link : https://leetcode.com/problems/coin-change/description/

class Solution {

    public int solve(int remain, int[] dp, int[] coins) {

        if(remain < 0) return Integer.MAX_VALUE;

        if(remain == 0) return 0;

        if(dp[remain] != -1) return dp[remain];

        int minCoins = Integer.MAX_VALUE;

        for(int coin : coins) {

            int coinCount = solve(remain - coin, dp, coins);

            if(coinCount != Integer.MAX_VALUE) minCoins = Math.min(minCoins, coinCount + 1);
        }

        dp[remain] = minCoins;

        return dp[remain];
    }

    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1]; // dp[remain] = min. coins required to form remain

        Arrays.fill(dp, -1);

        int result = solve(amount, dp, coins);

        if(result == Integer.MAX_VALUE) return -1;

        return result;
   
    }
}
