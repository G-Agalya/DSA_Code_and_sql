class Solution:
    def minimumBoxes(self, a: List[int], c: List[int]) -> int:
        c.sort()
        sum=0
        for i in range(len(a)):
            sum=sum+a[i]
        sum1=0
        v=0
        for i in range(len(c)-1,-1,-1):
            sum1=sum1+c[i]
            v=v+1
            if(sum1>=sum):
               return v
        return 0
