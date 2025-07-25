class Solution {
    public boolean isValid(String word) {
        int c=0;
        int v=0;
        int co=0;
        for(int i=0;i<word.length();i++){
            char w=word.charAt(i);
            if((w=='a' || w=='e' || w=='i' || w=='o' || w=='u') ||(w=='A' || w=='E' || w=='I' || w=='O' || w=='U')){
                v++;
            }
            else if((w>='a' && w<='z') || (w>='A' && w<='Z')){
                co++;
            }
            if(!((w>='a' && w<='z') || (w>='A' && w<='Z') ||(w>='0' && w<='9'))){
                return false;
            }
        }
        if(word.length()>=3 && v>=1 && co>=1){
            return true;
        }
        return false;
    }
}