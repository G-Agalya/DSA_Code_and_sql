class Solution {
    public int busyStudent(int[] s, int[] e, int q) {
        int n=s.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(q>=s[i] && q<=e[i] ){
                c++;
            }
        }
        return c;
    }
}