class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                arr.add(nums[i]);
            }
            else{
                arr1.add(nums[i]);
            }
        }
        int y=0;
        
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
            nums[i]=arr.get(y);
            y++;
            }
            
        }
        y=0;
        for(int i=0;i<nums.length;i++){
            if(i%2!=0){
            nums[i]=arr1.get(y);
            y++;
            }
            
        }
        return nums;
    }
}