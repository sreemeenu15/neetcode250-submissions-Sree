class MyHashMap {

    int n = 1000001;
    int[] set = new int[n];
    boolean[] set1 = new boolean[n];

    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        
        set[key] = value;
        set1[key] = true;
        
    }
    
    public int get(int key) {
        
       if(set1[key])return set[key];
       return -1;
    }
    
    public void remove(int key) {
        
        set[key] = -1;
        set1[key] = false;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */