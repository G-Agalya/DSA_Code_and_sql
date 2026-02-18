class Solution:
    def hasAlternatingBits(self, n: int) -> bool:
        m=format(n,'b')
        for i in range(len(m)-1):
            if m[i]==m[i+1]:
               return False
        return True
