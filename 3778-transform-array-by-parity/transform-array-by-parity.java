class Solution {
    public int[] transformArray(int[] nums) {
        int n=nums.length;
        int y=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
               y++;
            }
        }
        int l=0;
        for(int i=n-1;i>=0;i--){
            if(y==0){
                break;
            }
            arr[i]=1;
            y--;
        }
        return arr;
    }
}