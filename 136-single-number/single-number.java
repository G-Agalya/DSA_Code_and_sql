class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> arr=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            arr.put(nums[i],arr.getOrDefault(nums[i],0)+1);
        }
        for(int j:arr.keySet()){
            if(arr.get(j)==1){
                return j;
            }
        }
        return 0;
    }
}