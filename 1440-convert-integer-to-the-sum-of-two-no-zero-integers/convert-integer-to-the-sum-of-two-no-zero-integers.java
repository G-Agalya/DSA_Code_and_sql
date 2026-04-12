class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] arr=new int[2];
        int i=1;
        int a=i;
        int b=n-i;
        while(b<n){
           if(rev(a) && rev(b) && (a+b==n)){
             arr[0]=a;
             arr[1]=b;
             break;
           }
             a++;
             b--;
           
        }
        return arr;
    }
    public boolean rev(int a){
        while(a!=0){
           if(a%10==0){
            return false;
           }
           a=a/10;
        }
        return true;
    } 
}