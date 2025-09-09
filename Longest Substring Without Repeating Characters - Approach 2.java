// Problem Link : https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

class Solution {

    public int lengthOfLongestSubstring(String s) {

        if(s.length() == 0) return 0;

        Map<Character, Integer> map = new HashMap<>(); // Map -> {character , index}

        int maxLen = Integer.MIN_VALUE;

        int left = 0;

        int right = 0;

        while(right < s.length()) {

            char ch = s.charAt(right);

            if(map.containsKey(ch)) left = Math.max(left, map.get(ch) + 1);

            maxLen = Math.max(maxLen, right - left + 1);

            map.put(ch, right);

            right++;
        }

        return maxLen;
    }
}
