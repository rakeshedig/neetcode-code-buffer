class MyHashMap {

    int[] Map;

    public MyHashMap() {

        Map = new int[1000001];
        Arrays.fill(Map, -1);
        
    }
    
    public void put(int key, int value) {

        Map[key] = value;
        
    }
    
    public int get(int key) {

        return Map[key];
        
    }
    
    public void remove(int key) {

        Map[key] = -1;
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */