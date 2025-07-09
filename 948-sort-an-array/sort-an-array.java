class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        int i=1;
        while(i<n){
            int c=nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>c){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=c;
            i++;
        }
        
        return nums;
    }
}