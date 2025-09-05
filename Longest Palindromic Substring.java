// Problem Link : https://leetcode.com/problems/longest-palindromic-substring/description/

class Solution {

    public String longestPalindrome(String s) {

        int start = 0;

        int maxLen = 1;

        int left = -1;

        int right = -1;

        for(int i=1; i<s.length(); i++) {

            // for even

            left = i - 1;

            right = i;

            while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {

                if(right - left + 1 > maxLen) {

                    maxLen = right - left + 1;

                    start = left;
                }

                left--;

                right++;
            }

            // for odd

            left = i - 1;

            right = i + 1;

            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {

                if(right - left + 1 > maxLen) {

                    maxLen = right - left + 1;

                    start = left;
                }

                left--;

                right++;
            }

        }

        return s.substring(start, start + maxLen);
        
    }
}
