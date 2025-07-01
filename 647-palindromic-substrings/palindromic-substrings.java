class Solution {
    public int countSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub=s.substring(i,j+1);
                boolean val=rev(sub);
                if(val){
                    c++;
                }
            }
        }
        return c;
    }
    public static boolean rev(String sub){
        StringBuilder str=new StringBuilder(sub);
        if(str.reverse().toString().equals(sub)){
            return true;
        }
        return false;
    }
}