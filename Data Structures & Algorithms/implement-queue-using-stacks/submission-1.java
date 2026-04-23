class MyQueue {
    
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

    public MyQueue() {

    }
    
    public void push(int x) {
        
        s1.push(x);
    }
    
    public int pop() {
        int removed = 0;
        
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        if(!s2.isEmpty()){
            removed = s2.pop();
        }

        if(!s2.isEmpty()){
            s1.push(s2.pop());
        }


        return removed;
    }
    
    public int peek() {

        int front = 0;
        
         while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        if(!s2.isEmpty()){
            front = s2.peek();
        }

         if(!s2.isEmpty()){
            s1.push(s2.pop());
        }



        return front;
    }
    
    public boolean empty() {
        
        if(s1.isEmpty() && s2.isEmpty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */