class NumArray {
    int[] prv;
    public NumArray(int[] nums) { 
        int n=nums.length;
        prv=new int[n];
        prv[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prv[i]=prv[i-1]+nums[i];
        }

    }
    
    public int sumRange(int left, int right) {
        if(left==0){
            return prv[right];
        }
        else{
            return prv[right]-prv[left-1];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */