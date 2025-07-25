class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int sum=-1;
        for(int k:map.keySet()){
            if(k==map.get(k)){
                sum=k;
            }
        }
        return sum;
    }
}