// Problem Link : https://leetcode.com/problems/maximum-sum-circular-subarray/

class Solution {

    public int kadanesMax(int[] nums) {

        int sum = nums[0];

        int maxSum = nums[0];

        for(int i=1; i<nums.length; i++) {

            sum = Math.max(sum + nums[i], nums[i]);

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public int kadanesMin(int[] nums) {

        int sum = nums[0];

        int minSum = nums[0];

        for(int i=1; i<nums.length; i++) {

            sum = Math.min(sum + nums[i], nums[i]);

            minSum = Math.min(minSum, sum);
        }

        return minSum;
    }

    public int maxSubarraySumCircular(int[] nums) {

        int totalSum = 0;

        for(int ele : nums) totalSum = totalSum + ele;

        int maxSum = kadanesMax(nums);

        int minSum = kadanesMin(nums);

        int circularSubarraySum = totalSum - minSum;

        if(maxSum > 0) return Math.max(maxSum, circularSubarraySum);

        return maxSum;
        
    }
}
