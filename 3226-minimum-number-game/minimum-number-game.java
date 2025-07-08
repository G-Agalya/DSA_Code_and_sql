class Solution {
    public int[] numberGame(int[] nums) {
        int[] res=new int[nums.length];
        int a=0;
        int b=0;
        Arrays.sort(nums);
        int o=0;
        for(int i=0;i<nums.length/2;i++){
            a=nums[o];
            b=nums[o+1];
            res[o]=b;
            res[o+1]=a;
            o+=2;
        }
        return res;
    }
}