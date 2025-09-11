// Problem Link : https://leetcode.com/problems/minimum-window-substring/description/

class Solution {

    public String minWindow(String s, String t) {

        if(s.length() < t.length()) return "";

        Map<Character, Integer> map = new HashMap<>();

        int countReq = t.length();

        int windowSize = Integer.MAX_VALUE;

        for(int i=0; i<t.length(); i++) {

            char ch = t.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int left = 0;

        int right = 0;

        int startIndex = -1;

        while(right < s.length()) {

            char rightCh = s.charAt(right);

            int val = map.getOrDefault(rightCh, 0);

            if(val > 0) countReq--;

            val--;

            map.put(rightCh, val);

            while(countReq == 0) {

                if(windowSize > right - left + 1) {

                    windowSize = Math.min(windowSize, right - left + 1);

                    startIndex = left;
                }

                char leftCh = s.charAt(left);

                int freq = map.get(leftCh);

                freq++;

                map.put(leftCh, freq);

                left++;

                if(freq > 0) countReq++;
            }

            right++;

        }

        if(startIndex == -1) return "";

        return s.substring(startIndex, startIndex + windowSize);
        
    }
}
