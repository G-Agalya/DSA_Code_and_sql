class Solution:
    def removeTrailingZeros(self, num: str) -> str:
        c=0
        for i in range(len(num)-1,-1,-1):
            if(num[i]=="0"):
                c+=1
            else:
                break
        n=len(num)-c
        s=num[0:n]
        return s