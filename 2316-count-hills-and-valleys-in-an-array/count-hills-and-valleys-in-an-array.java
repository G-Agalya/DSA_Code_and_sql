class Solution {
    public int countHillValley(int[] nums) {
        
        int v=0;
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!= nums[i+1]){
                arr.add(nums[i]);
            }
        }
        arr.add(nums[nums.length-1]);
        for(int i=1;i<arr.size()-1;i++){
           if((arr.get(i-1)>arr.get(i) && arr.get(i+1)>arr.get(i))||(arr.get(i-1)<arr.get(i) && arr.get(i+1)<arr.get(i))){
            v++;
           }
        }
        return v;
    }
}