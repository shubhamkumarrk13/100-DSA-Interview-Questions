// Problem Link : https://leetcode.com/problems/valid-palindrome/description/

class Solution {

    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        StringBuilder str = new StringBuilder();

        for(int i=0 ; i<s.length() ; i++) {

            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)) str.append(ch);
        }

        int left = 0;

        int right = str.length() - 1;

        while(left < right) {

            if(str.charAt(left) != str.charAt(right)) return false;

            left++;

            right--;
        }

        return true;
        
    }
}
