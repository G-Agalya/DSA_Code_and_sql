class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        length=len(nums)
        
        nums.sort()
        c=(nums[length-2]-1)*(nums[length-1]-1)
        return c