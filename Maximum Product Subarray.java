// Problem Link : https://leetcode.com/problems/maximum-product-subarray/description/

class Solution {

    public int maxProduct(int[] nums) {

        int maxProduct = Integer.MIN_VALUE;

        int prefix = 1;

        for(int i=0 ; i<nums.length ; i++) {

            prefix = prefix * nums[i];

            maxProduct = Math.max(maxProduct, prefix);

            if(prefix == 0) prefix = 1;
        }

        int suffix = 1;

        for(int i=nums.length-1 ; i>=0 ; i--) {

            suffix = suffix * nums[i];

            maxProduct = Math.max(maxProduct, suffix);

            if(suffix == 0) suffix = 1;
        }

        return maxProduct;
        
    }
}
