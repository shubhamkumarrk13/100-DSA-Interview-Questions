// Problem Link : https://leetcode.com/problems/number-of-1-bits/description/

class Solution {

    public int hammingWeight(int n) {
        
        int cnt = 0;

        while(n > 0) {

            if((n & 1 )== 1) cnt++;

            n = n >> 1;
        }

        return cnt;
    }
}
