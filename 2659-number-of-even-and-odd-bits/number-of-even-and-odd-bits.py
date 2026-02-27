class Solution:
    def evenOddBit(self, n: int) -> List[int]:
        s=format(n, 'b')
        n1=0
        m=0
        j=0
        for i in range(len(s)-1,-1,-1):
          if(s[i]=='1'):
            if(j%2==0):
              n1+=1
            else:
              m+=1
          j+=1
        l=[n1,m]
        return l