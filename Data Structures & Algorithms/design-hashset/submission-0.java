class MyHashSet {

    int n = 10000001;

    boolean set[] = new boolean[n];

    public MyHashSet() {
        
    }
    
    public void add(int key) {
        
      if(set[key] == false){
        set[key] = true;
      }
      return;
    }
    
    public void remove(int key) {

       if(set[key] == true){
        set[key] = false;
       }

       return;
    }
    
    public boolean contains(int key) {
        
       if(set[key] == true) return true;
       return false;

    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */