class Solution:
    def busyStudent(self, s: List[int], e: List[int], q: int) -> int:
        length=len(s)
        c=0
        for i in range(0,length):
             if(q>=s[i] and q<=e[i]):
                 c+=1;
        return c
