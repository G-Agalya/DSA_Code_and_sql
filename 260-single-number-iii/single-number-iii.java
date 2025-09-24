class Solution {
    public int[] singleNumber(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!arr.contains(nums[i])){
                 arr.add(nums[i]);
            }
            else{
                arr1.add(nums[i]);
            }
        }
        int[] res=new int[2];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(!arr1.contains(nums[i])){
               res[j]=nums[i];
               j++;
            }
        }
        return res;
    }
}