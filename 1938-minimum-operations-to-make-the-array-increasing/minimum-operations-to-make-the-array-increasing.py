class Solution:
    def minOperations(self, nums: List[int]) -> int:
        y=len(nums)
        c=0
        if(y<=1):
            return 0
        for i in range(y-1):
            if(nums[i]>=nums[i+1]):
                c=c+((nums[i]+1)-nums[i+1])
                nums[i+1]=nums[i]+1
        if(nums[y-2]>=nums[y-1]):
                c=c+((nums[y-2]+1)-nums[y-1])
        return c
        
        