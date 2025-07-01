class Solution {
    public int strStr(String h, String n) {
        for(int i=0;i<h.length();i++){
            for(int j=i;j<h.length();j++){
                String sub=h.substring(i,j+1);
                if(sub.equals(n)){
                    return i;
                }
            }
        }
        return -1;
    }
}