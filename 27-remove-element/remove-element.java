class Solution {
    public int removeElement(int[] nums, int val) {

        int c=0;
        for(int j=0;j<nums.length;j++){
            if(val==nums[j]){
                nums[j]=-1;
                c++;
            }
        }
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=-1){
                nums[p]=nums[i];
                p++;
            }

        }
        return nums.length-c;
    }
}