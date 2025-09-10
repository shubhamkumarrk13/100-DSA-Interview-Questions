// Problem Link : https://leetcode.com/problems/letter-combinations-of-a-phone-number/

class Solution {

    Map<Character, String> map = new HashMap<>();

    public void solve(String digits, StringBuilder temp, List<String> result, int ind) {

        if(ind == digits.length()) {

            result.add(temp.toString());

            return;
        }

        char digit = digits.charAt(ind);

        String str = map.get(digit);

        for(int i=0; i<str.length(); i++) {

            char ch = str.charAt(i);

            temp.append(ch);

            solve(digits, temp, result, ind + 1);

            temp.deleteCharAt(temp.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {

        map.put('2', "abc");

        map.put('3', "def");

        map.put('4', "ghi");

        map.put('5', "jkl");

        map.put('6', "mno");

        map.put('7', "pqrs");

        map.put('8', "tuv");

        map.put('9', "wxyz");

        List<String> result = new ArrayList<>();

        if(digits.length() == 0) return result;

        StringBuilder temp = new StringBuilder();

        solve(digits, temp, result, 0);

        return result;
        
    }
}
