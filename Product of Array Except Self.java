// Problem Link : https://leetcode.com/problems/product-of-array-except-self/description/

class Solution {

    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];

        int product = 1;

        int zeroes = 0;

        // Count the number of zeros, if zeroes > 1, then result array will contain all zeroes

        for(int i=0; i<nums.length; i++) {

            if(nums[i] == 0) zeroes++;
        }

        if(zeroes > 1) {

            Arrays.fill(result, 0);

            return result;
        }

        for(int i=0; i<nums.length; i++) {

            if(nums[i] == 0) continue;

            product = product * nums[i];
        }

        for(int i=0; i<nums.length; i++) {

            if(zeroes > 0) {

                if(nums[i] == 0) result[i] = product;

                else result[i] = 0;
            }

            else result[i] = product / nums[i];
        }

        return result;
        
    }
}
