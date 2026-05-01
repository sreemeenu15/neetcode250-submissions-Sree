class MyHashSet {

    int n = 10000001;

    boolean set[] = new boolean[n];

    public MyHashSet() {
        
    }
    
    public void add(int key) {
     
        set[key] = true;
      
      return;
    }
    
    public void remove(int key) {

     
        set[key] = false;
     
       return;
    }
    
    public boolean contains(int key) {
        
      return set[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */