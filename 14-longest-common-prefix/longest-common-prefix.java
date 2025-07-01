class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder st=new StringBuilder();
        Arrays.sort(strs);
        char[] f=strs[0].toCharArray();
        char[] e=strs[strs.length-1].toCharArray();
        for(int i=0;i<f.length;i++){
            if(f[i]!=e[i]){
                break;
            }
            st.append(f[i]);
        }
      return st.toString();
        
    }
}