class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==goal){
                    c++;
                }
            }
        }
        return c;
    }
}