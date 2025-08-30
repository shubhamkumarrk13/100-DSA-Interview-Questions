// Problem Link : https://leetcode.com/problems/missing-number/description/

class Solution {

    public int missingNumber(int[] nums) {

        int n = nums.length;

        int totalSum = n * (n + 1)/2;

        int arrSum = 0;

        for(int i=0 ; i<n ; i++) {

            arrSum = arrSum + nums[i];
        }

        return totalSum - arrSum;
        
    }
}
