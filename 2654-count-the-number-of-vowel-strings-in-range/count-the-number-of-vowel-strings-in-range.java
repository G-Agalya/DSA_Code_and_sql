class Solution {
    public int vowelStrings(String[] w, int l, int r) {
        int c=0;
        for(int i=l;i<=r;i++){
           char c1=w[i].charAt(0);
           char c2=w[i].charAt(w[i].length()-1);
           if((c1=='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u')&&(c2=='a' || c2=='e' || c2=='i' || c2=='o' || c2=='u')){
             c++;
           }
        }
        return c;
    }
}