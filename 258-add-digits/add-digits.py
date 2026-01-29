class Solution:
    def addDigits(self, num: int) -> int:
        sum=0
        while(num>9):
            sum=0
            while(num!=0):
              y=num%10
              sum=sum+y
              num=int(num/10)
            num=sum
        if(sum==0):
            return num
        return sum
            