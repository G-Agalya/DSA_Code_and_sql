class Solution {
    public String reversePrefix(String s, int k) {
       if(k<=s.length()){
       String str=s.substring(0,k);
       String d="";
       for(int i=str.length()-1;i>=0;i--){
        d+=str.charAt(i)+"";
       }
       d+=s.substring(k,s.length());
       return d;
       }
       return s;
    }
}