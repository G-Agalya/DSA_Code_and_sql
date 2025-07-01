class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int[] pre=new int[len];
        int[] sif=new int[len];
        int pro=1;
        int po=1;
       
        for(int i=0;i<len;i++){
             pre[i]=pro;
            pro*=nums[i];
        }
        
       
        for(int i=len-1;i>=0;i--){
            sif[i]=po;
            po*=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=pre[i]*sif[i];
        }
        return nums;
    }
}