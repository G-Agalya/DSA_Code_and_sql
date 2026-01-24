class Solution:
    def addedInteger(self, nums1: List[int], nums2: List[int]) -> int:
        sum2=0
        for i in range(len(nums1)):
            sum2+=nums1[i]
        sum1=0
        for j in range(len(nums2)):
            sum1+=nums2[j]
        d=sum1-sum2
        h=len(nums1)
        n=int(d/h)
        
        return n
