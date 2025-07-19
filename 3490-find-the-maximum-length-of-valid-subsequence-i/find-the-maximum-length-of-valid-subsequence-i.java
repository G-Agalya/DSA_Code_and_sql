class Solution {
    public int maximumLength(int[] nums) {
        int i=1;
        int odd=nums[0]%2!=0?1:0;
        int even=(nums[0]%2==0)?1:0;
        int alter=1;
        boolean flag=(nums[0]%2!=0)?true:false;
       while(i<nums.length){
          
          if((flag==true && nums[i]%2==0)|| (flag==false && nums[i]%2!=0)){
            alter++;
            flag=!flag;
          }
          if(nums[i]%2==0){
             even++;
          }
          else if(nums[i]%2!=0){
            odd++;
          }
        i++;
       }
       int res=Math.max(odd,Math.max(even,alter));
       return res;
    }
}