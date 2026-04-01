class Solution:
    def trimTrailingVowels(self, s: str) -> str:
        ind=-1
        for i in range(len(s)-1,-1,-1):
            if not (s[i]=="a" or s[i]=="e" or s[i]=="i" or s[i]=="o" or s[i]=="u"):
                ind=i
                break
        return s[0:ind+1]
