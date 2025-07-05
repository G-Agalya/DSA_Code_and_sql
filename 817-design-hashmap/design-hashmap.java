class MyHashMap {
    public Map<Integer,Integer> MyHashMap;
    public MyHashMap() {
        MyHashMap=new HashMap<>();
    }
    
    public void put(int key, int value) {
        MyHashMap.put(key,value);
    }
    
    public int get(int key) {
        int sum=-1;
        for(int i:MyHashMap.keySet()){
            if(i==key){
                sum=MyHashMap.get(i);
            }
        }
        return sum;
    }
    
    public void remove(int key) {
        MyHashMap.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */