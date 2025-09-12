// Problem Link : https://leetcode.com/problems/palindrome-number/description/

class Solution {

    public boolean isPalindrome(int x) {

        if(x < 0) return false;

        int num = x;

        int result = 0;

        while(num > 0) {

            int d = num % 10;

            result = (result * 10) + d;

            num = num / 10;
        }

        if(result == x) return true;

        return false;
        
    }
}
