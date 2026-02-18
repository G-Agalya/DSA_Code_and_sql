class Solution:
    def repeatedSubstringPattern(self, s: str) -> bool:
        str=s+s
        f=str[1:len(str)-1]
        return s in f