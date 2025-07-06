class Solution {
    public char kthCharacter(int k) {
         String str="a";
        while(str.length()<=k){
            String d="";
            for(int j=0;j<str.length();j++){
                char ch=(char)(str.charAt(j)+1);
                d+=ch;
            }
            str+=d;
         }
         return str.charAt(k-1);
    }
}