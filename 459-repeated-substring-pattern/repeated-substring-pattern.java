class Solution {
    public boolean repeatedSubstringPattern(String s) {
       String str=s+s;
       String h=str.substring(1,str.length()-1);
       return h.contains(s);
    }
}