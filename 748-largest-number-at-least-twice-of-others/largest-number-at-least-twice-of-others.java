class Solution {
    public int dominantIndex(int[] nums) {
        int sum=0;
        List<Integer> arr=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]*2); 
            if(max<nums[i]){
                max=nums[i];
                sum=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i!=sum){
             if(arr.get(i)>max){
              return -1;
            }
            }
        }
        return sum;
    }
}