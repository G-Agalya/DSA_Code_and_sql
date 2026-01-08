class Solution {
    public int[] leftRightDifference(int[] nums) {
        int k=nums.length;
        int[] arr1=new int[k];
        int sum=0;
        for(int i=0;i<k;i++){
            arr1[i]=sum;
            sum+=nums[i];
        }
        int[] arr2=new int[k];
        int sum2=0;
        for(int i=k-1;i>=0;i--){
            arr2[i]=sum2;
            sum2+=nums[i];
        }
        for(int i=0;i<k;i++){
            nums[i]=Math.abs(arr1[i]-arr2[i]);
        }
        return nums;
    }
}