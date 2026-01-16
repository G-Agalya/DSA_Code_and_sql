class Solution {
    public int maxDistinct(String s) {
        boolean[] arr=new boolean[2000];
        int c=0;
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)]==false){
                c++;
                arr[s.charAt(i)]=true;
            }
        }
        return c;
    }
}