class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        int k=nums.length;
        if(k<=1){
            return 0;
        }
       for(int i=0;i<nums.length-1;i++){
          if(nums[i]>=nums[i+1]){
             c+=((nums[i]+1)-nums[i+1]);
             nums[i+1]=(nums[i]+1);
          }
       }
      
       if(nums[k-2]>=nums[k-1]){
             c+=((nums[k-2]+1)-nums[k-1]);
             nums[k-1]=c;
        }
       
       return c; 
    }
}