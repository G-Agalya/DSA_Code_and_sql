class Solution {
    public int reverseBits(int n) {
        String str=Integer.toBinaryString(n);
        StringBuilder str1=new StringBuilder(str);
        while(str1.length()<32){
            str1.insert(0,"0");
        }
        int h=Integer.parseInt(str1.reverse().toString(),2);
        return h;
    }
}