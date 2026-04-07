class Solution {
    public int sumBase(int n, int k) {
        String h=Integer.toString(n,k);
        int y=Integer.parseInt(h);
        int sum=0;
        while(y!=0){
           sum+=y%10;
           y=y/10;
        }
        return sum;
    }
}