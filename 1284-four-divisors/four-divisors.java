class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            int s=0;
            for(int j=1;j*j<=nums[i];j++){
                if(nums[i]%j==0){
                    int y=nums[i]/j;
                    if(y==j){
                        c++;
                        s+=j;
                    }
                    else{
                    c+=2;
                    s=s+j+y;
                    }
                }
            }
            if(c==4){
               sum+=s;
            }
        }
        return sum;
    }
}