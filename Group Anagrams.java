// Problem Link : https://leetcode.com/problems/group-anagrams/description/

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        List<List<String>> result = new ArrayList<>();

        for(int i=0; i<strs.length; i++) {

            char[] temp = strs[i].toCharArray();

            Arrays.sort(temp);

            map.computeIfAbsent(new String(temp), k -> new ArrayList<>()).add(strs[i]);
        }

        for(Map.Entry<String, List<String>> entry : map.entrySet()) {

            result.add(entry.getValue());
        }

        return result;
        
    }
}
