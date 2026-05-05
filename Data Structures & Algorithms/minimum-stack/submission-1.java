class MinStack {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer>  s2 = new Stack<>();
    
    int min;



    public MinStack() {
        
    }
    
    public void push(int val) {
        
        if(s1.isEmpty()){

            s1.push(val);
            min = val;
            s2.push(min);

        }else{
             
             if(val < s2.peek()){
                
                s1.push(val);
                 min = val;
                 s2.push(min);

             }else{

                s1.push(val);
                min = s2.peek();
                s2.push(min);
                //without updating the min Alfred?
             }

        }
    }
    
    public void pop() {
        
        if(!s1.isEmpty()){
            
            s1.pop();
            s2.pop();
        }
        return;


    }
    
    public int top() {
      
      
      if(s1.isEmpty()){
        return 0;
      }else{
        return s1.peek();
      }

    }
    
    public int getMin() {
        
        return s2.peek();
    }
}
