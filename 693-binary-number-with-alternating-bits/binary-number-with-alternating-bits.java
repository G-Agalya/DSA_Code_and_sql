class Solution {
    public boolean hasAlternatingBits(int n) {
        String m=Integer.toBinaryString(n);
        int l=m.length();
        for(int i=0;i<l-1;i++){
           if(m.charAt(i)==m.charAt(i+1)){
            return false;
           }
        }
        return true;
    }
}