class Solution {
    public boolean judgeCircle(String m) {
        int l=0;
        int u=0;
        int r=0;
        int d=0;
        for(int i=0;i<m.length();i++){
            char t=m.charAt(i);
            if(t=='L'){
                l++;
            }
            else if(t=='R'){
                r++;
            }
            else if(t=='U'){
                u++;
            }
            else if(t=='D'){
                d++;
            }
        }
        if((l==r)&&(u==d)){
            return true;
        }
        return false;
    }
}