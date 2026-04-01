class Solution {
    public String trimTrailingVowels(String s) {
        int ind=-1;
        for(int i=s.length()-1;i>=0;i--){
            char h=s.charAt(i);
            if(!(h=='a' || h=='e' || h=='i' || h=='o' || h=='u')){
                ind=i;
                break;
            }
        }
        return s.substring(0,ind+1);
    }
}