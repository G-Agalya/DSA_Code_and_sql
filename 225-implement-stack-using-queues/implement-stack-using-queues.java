class MyStack {

    Stack<Integer> st;
    public MyStack() {
        st=new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        int m=st.pop();
        return m;
    }
    
    public int top() {
        int h=st.peek();
        return h;
    }
    
    public boolean empty() {
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */