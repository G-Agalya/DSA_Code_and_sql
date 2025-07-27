class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> arr1=new HashMap<>();
        for(char i:jewels.toCharArray()){
            arr1.put(i,arr1.getOrDefault(i,0)+1);
        }
        Map<Character,Integer> arr2=new HashMap<>();
        for(char i:stones.toCharArray()){
            arr2.put(i,arr2.getOrDefault(i,0)+1);
        }
        int sum=0;
        for(char i:arr1.keySet()){
            if(arr2.containsKey(i)){
            sum+=arr2.get(i);
            }
        }
        return sum;
    }
}