// Problem Link : https://leetcode.com/problems/min-stack/description/

class MinStack {

    Stack<Long> st;

    long mini;

    public MinStack() {

        st = new Stack<>();

        mini = Long.MAX_VALUE;
        
    }
    
    public void push(int val) {

        if(st.isEmpty()) {

            st.push((long)val);

            mini = (long) val;
        }

        else {

            if(val < mini) {

                long newVal = 2*(long)val - mini;

                st.push(newVal);

                mini = (long)val;
            }

            else st.push((long)val);
        }
        
    }
    
    public void pop() {

        if(st.isEmpty()) return;
 
        long stackElement = st.pop();

        if(stackElement < mini) {

            long newVal = (2*mini) - stackElement;

            mini = newVal;
        }
        
    }
    
    public int top() {

        if(st.isEmpty()) return 0;

        long stackElement = st.peek();

        if(stackElement > mini) return (int)stackElement;

        else return (int)mini;
        
    }
    
    public int getMin() {
        
        if(st.isEmpty()) return -1;

        return (int)mini;
    }
}
