class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> arr=new HashMap<>();
        int sum=0;
        int c=0;
        for(int num:nums){
            sum+=num;
            
            if(sum==k){
                c++;
            }
            if(arr.containsKey(sum-k)){
                c+=arr.get(sum-k);
                
            }
            arr.put(sum,arr.getOrDefault(sum,0)+1);
            
        }
        return c;
    }
}