class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> arr=new LinkedHashSet<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
            arr.add(nums[i]);    
            }
            if(max<nums[i]){
                max=nums[i];
            } 
        }
        int sum=0;
        for(int l:arr){
            sum+=l;
        }
        if(max<0){
            return max;
        }
        return sum;
    }
}