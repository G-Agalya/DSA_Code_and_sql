class Solution {
    public boolean isTrionic(int[] nums) {
        boolean fl1=false;
        boolean fl2=false;
        boolean fl3=false;
        int y=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                fl1=true;
            }
            else{
                y=i;
                break;
            }
        }
        int u=0;
        if(y!=0 && y!=nums.length-1){
        for(int i=y;i<nums.length-1;i++){
           if(nums[i]>nums[i+1]){
              fl2=true;
           }
           else{
             u=i;
             break;
           }
        }
        }
        if(u!=0 && u!=nums.length-1 && u!=y){
        for(int i=u;i<nums.length-1;i++){
           if(nums[i]<nums[i+1]){
              fl3=true;
           }
           else{
            fl3=false;
            break;
           }
           
        }
        }
        if((fl1 && fl2) && fl3){
            return true;
        }
        return false;

    }
}