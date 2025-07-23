class Solution {
    public int getMaximumGenerated(int n) {
        int[] arr=new int[n+1];
        if(n==0){
            return 0;
        }
        arr[0]=0;
        arr[1]=1;
        for(int i=1;i<n+1;i++){
            if((2*i)+1>n){
              break;
            }
            else{
                arr[2*i]=arr[i];
                arr[2*i+1]=arr[i]+arr[i+1];
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n+1;i++){
            
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}