class MyStack {
    

        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();

    public MyStack() {

        
    }
    
    public void push(int x) {
        
        //Alfred should I check the size of queue before inserting or are
        //they dynamic

        q1.add(x);
    }
    
    public int pop() {
        
        while(q1.size() != 1){
           q2.add(q1.poll());
        }

        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }

        return q1.poll();
    }
    
    public int top() {
        
        while(q1.size() != 1){
           q2.add( q1.poll());

        }

        int first = q1.peek();
        
         while(!q2.isEmpty()){
            q1.add(q2.poll());
        }

        q1.add(q1.poll());

        return first;
        
    }
    
    public boolean empty() {
        if(q1.isEmpty() && q2.isEmpty()){

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