class Solution {
    public int[] shuffle(int[] nums, int n) {
        List<Integer> sum1=new ArrayList<>();
        List<Integer> sum2=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i<n){
                sum1.add(nums[i]);
            }
            else{
                sum2.add(nums[i]);
            }
        }
        int k=0;
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=sum1.get(k);
                k++;
            }
            else{
                nums[i]=sum2.get(m);
                m++;
            }
        }
        return nums;
    }
}