class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double res=(double)sum/k;
        
        for(int i=k;i<nums.length;i++){
            sum=sum-nums[i-k]+nums[i];
            res=Math.max(res,(double)sum/k);
        }
        return res;
    }
}