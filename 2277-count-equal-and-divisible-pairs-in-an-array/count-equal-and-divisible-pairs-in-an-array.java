class Solution {
    public int countPairs(int[] nums, int k) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int sum=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    sum=i*j;
                    if(sum%k==0){
                        c++;
                    }
                }
            }
        }
        return c;
    }
}