class Solution {
    public int countPrimeSetBits(int l, int r) {
        int co=0;
        for(int i=l;i<=r;i++){
           int c=Integer.bitCount(i);
           if(isprime(c)){
            System.out.print(c+" ");
            co++;
           }
        }
        return co;
    }
    public boolean isprime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}