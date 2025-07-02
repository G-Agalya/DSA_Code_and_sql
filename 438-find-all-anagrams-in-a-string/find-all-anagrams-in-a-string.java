class Solution {
    public List<Integer> findAnagrams(String s, String p1) {
        int l=0;
        List<Integer> arr=new ArrayList<>();
        StringBuilder sub=new StringBuilder();
        int in=0;
        int len=p1.length();
        char[] p=p1.toCharArray();
        Arrays.sort(p);
        for(int i=0;i<len && i<s.length();i++){
           sub.append(s.charAt(i));
          
        }
        char[] c=sub.toString().toCharArray();
         Arrays.sort(c);
        if(Arrays.equals(p,c)){
            arr.add(0);
        }
        for(int i=len;i<s.length();i++){
           sub.deleteCharAt(0);
           sub.append(s.charAt(i));
           char[] c1=sub.toString().toCharArray();
         Arrays.sort(c1);
        if(Arrays.equals(p,c1)){
            arr.add(i-len+1);
        }
        }
        return arr;
    }
}