// Problem Link : https://leetcode.com/problems/bitwise-and-of-numbers-range/

class Solution {

    public int rangeBitwiseAnd(int left, int right) {

        while(right > left) {

            right = right & (right - 1); // n & (n - 1)
        }

        return right;
        
    }
}
