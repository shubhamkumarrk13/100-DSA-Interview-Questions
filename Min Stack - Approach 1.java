// Problem Link : https://leetcode.com/problems/min-stack/description/

class Pair {

    int value;

    int min;

    public Pair(int value, int min) {

        this.value = value;

        this.min = min;
    }
}

class MinStack {

    Stack<Pair> st;

    public MinStack() {
        
        st = new Stack<>();
    }
    
    public void push(int val) {

        if(st.isEmpty()) st.push(new Pair(val, val));

        else {

            int prevMin = st.peek().min;

            st.push(new Pair(val, Math.min(val, prevMin)));
        }
        
    }
    
    public void pop() {

        if(st.isEmpty()) return;

        st.pop();
        
    }
    
    public int top() {

        if(st.isEmpty()) return 0;

        return st.peek().value;
        
    }
    
    public int getMin() {
        
        if(st.isEmpty()) return 0;

        return st.peek().min;
    }
}
