class Solution {
    public int passThePillow(int n, int time) {
        int pos=1;
        int dic=1;
        for(int i=0;i<time;i++){
            if(pos==1){
               dic=1;
            }
            else if(pos==n){
                dic=-1;
            }
            pos+=dic;
        }
        return pos;
    }
}