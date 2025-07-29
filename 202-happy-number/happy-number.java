class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        boolean flag=false;
        for(int i=0;i<100;i++){
            sum=0;
        while(n!=0){
           int d=n%10;
           sum=sum+(d*d);
           n=n/10;
        }
        if(sum==1){
            flag=true;
            break;
        }
        n=sum;
        }
        return flag;
    }

}