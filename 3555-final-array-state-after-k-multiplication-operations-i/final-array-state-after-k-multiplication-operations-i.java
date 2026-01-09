class Solution {
    public int[] getFinalState(int[] nums, int k, int m) {
        
        while(k!=0){
            int y=nums[0];
            int j=0;
            for(int i=0;i<nums.length;i++){
                if(y>nums[i]){
                    y=nums[i];
                    j=i;
                }
            }
            nums[j]=y*m;
            k--;
            
        }
        return nums;
    }
}