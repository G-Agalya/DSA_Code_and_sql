class Solution {
    public int removeElement(int[] nums, int val) {
        int n=Integer.MAX_VALUE;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                nums[i]=n;
            }
            else{
                c++;
            }
        }
        Arrays.sort(nums);
        return c;
    }
}