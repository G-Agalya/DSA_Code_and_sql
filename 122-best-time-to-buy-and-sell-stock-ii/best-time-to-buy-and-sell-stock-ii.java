class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;
        int pro=0;
        int sum=0;
        for(int p:prices){
            if(p<min){
                min=p;
            }
            else{
                
                pro=p-min;
                sum+=pro;
                min=p;
            }
        }
        return sum;
    }
}