class Solution {
    public String reverseVowels(String s) {
        int l=0;
        int r=s.length()-1;
        StringBuilder str=new StringBuilder(s); 
        while(l<r){
            char a=str.charAt(l);
            char b=str.charAt(r);
            if((a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U') && (b=='a' || b=='e' || b=='i' || b=='o' || b=='u' || b=='A' || b=='E' || b=='I' || b=='O' || b=='U')) {
               char tem=str.charAt(l);
               str.setCharAt(l,str.charAt(r));
               str.setCharAt(r,tem);
               l++;
               r--;
            }
            else if((a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U') && !(b=='a' || b=='e' || b=='i' || b=='o' || b=='u' || b=='A' || b=='E' || b=='I' || b=='O' || b=='U')){
                 r--;
            }
            else{
                l++;
            }
        }
        return str.toString();
    }
}