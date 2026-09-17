class MinStack {
    private Stack<Integer> stack;
    Stack<Integer> tmp;

    public MinStack() {
        stack = new Stack<>();
        tmp = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(tmp.isEmpty() || val <= tmp.peek()){
            tmp.push(val);
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        int top = stack.pop();
        if(top == tmp.peek()){
            tmp.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return tmp.peek();
    }
}
