class Solution {
    public int minOperations(int[] nums, int k) {
        int q=0;
        for(int i=0;i<nums.length;i++){
            q+=nums[i];
        }
        // int w=q%k;
        // if(w==0){
        //     return 0;
        // }
        return q%k;
    }
}