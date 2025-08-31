// Problem Link : https://leetcode.com/problems/valid-parentheses/description/

class Solution {

    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for(int i=0 ; i<s.length() ; i++) {

            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[') st.push(ch);

            else {

                if(st.isEmpty()) return false;

                char stElement = st.pop();

                if(stElement == '(' && ch == ')' || stElement == '{' && ch == '}' || stElement == '[' && ch == ']') continue;

                else return false;
            }
        }

        if(!st.isEmpty()) return false;

        return true;
        
    }
}
