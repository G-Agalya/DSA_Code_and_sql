class NumArray {
    int[] prv;
    public NumArray(int[] nums) {
        prv=new int[nums.length];
        this.prv[0]=nums[0];
       
        int sum1=0;
        for(int i=1;i<nums.length;i++){
            sum1=prv[i-1]+nums[i];
            this.prv[i]=sum1;
        }
    }
    
    public int sumRange(int left, int right) {
        int sum=this.prv[right];
        if(left!=0){
        sum=sum-this.prv[left-1];
        }
        
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */