class Solution {
    public int strStr(String h, String n) {
        int len=h.length();
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                String sub=h.substring(i,j+1);
                if(sub.equals(n)){
                    return i;
                }
            }
        }
        return -1;
    }
}