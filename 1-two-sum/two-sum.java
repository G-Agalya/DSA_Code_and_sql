import java.util.Scanner;
class Solution {
   public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i+1;j<n;j++){
              sum=nums[i]+nums[j];
              if(sum==target){
                arr[0]=i;
                arr[1]=j;
                break;
              }
            }
        }
        return arr;
    }
}