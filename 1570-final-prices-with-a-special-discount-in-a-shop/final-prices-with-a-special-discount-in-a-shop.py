class Solution:
    def finalPrices(self, prices: List[int]) -> List[int]:
        a=[]
        length=len(prices)
        
        for i in range(0,length):
            n=True
            for j in range(i+1,length):
                if(prices[j]<=prices[i]):
                  n=prices[i]-prices[j]
                  a.append(n)
                  n=False
                  break
            if(n):
               a.append(prices[i])

        return a
        