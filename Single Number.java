// Problem Link :  https://leetcode.com/problems/single-number/description/

class Solution {

    public int singleNumber(int[] nums) {
        
        int xor = 0;

        for(int i=0 ; i<nums.length ; i++) {

            xor = xor ^ nums[i];
        }

        return xor;
    }
}
