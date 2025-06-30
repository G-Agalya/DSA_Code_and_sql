class Solution {
    public String reverseVowels(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' ||c=='U'){
                str+=c;
            }
        }
        String res="";
        int p=str.length()-1;
        for(int i=0;i<s.length();i++){
           char c=s.charAt(i);
           if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O'|| c=='U'){
             res+=str.charAt(p);
             p--;
           }
           else{
             res+=c;
           }
        }
        return res;
    }
}