// Problem Link : https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

class Solution {

    public int lengthOfLongestSubstring(String s) {

        if(s.length() == 0) return 0;

        Map<Character, Integer> map = new HashMap<>();

        int maxLen = Integer.MIN_VALUE;

        int left = 0;

        int right = 0;

        while(right < s.length()) {

            char ch = s.charAt(right);

            while(map.containsKey(ch)) {

                char leftChar = s.charAt(left);

                int freq = map.get(leftChar);

                freq--;

                if(freq == 0) map.remove(leftChar);

                else map.put(leftChar, freq);

                left++;
            }

            map.put(ch, 1);

            maxLen = Math.max(maxLen, right - left + 1);

            right++;
        }

        return maxLen;
        
    }
}
