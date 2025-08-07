class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int m=str1.length();
        int n=str2.length();
        int gcd=0;
        for(int i=1;i<=n;i++){
            if(m%i==0 && n%i==0){
                gcd=i;
            }
        }
        String s=str1.substring(0,gcd);
        return s;
    }
}