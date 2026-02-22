class Solution {
    public int binaryGap(int n) {
       String str=Integer.toBinaryString(n);
       int pre=-1;
       int ans=0;
       for(int i=0;i<str.length();i++){
          if(str.charAt(i)=='1'){
             if(pre!=-1){
                ans=Math.max(ans,i-pre);
             }
             pre=i;
          }
       }
       return ans;
    }
}