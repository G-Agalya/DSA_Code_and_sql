class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> arr=new HashSet<>();
        int l=0;
        int r=0;
        int max=0;
        while(r<=s.length()-1){
           char c=s.charAt(r);
           if(!arr.contains(c)){
            arr.add(c);
            max=Math.max(max,arr.size());
           }
           else{
             arr.remove(s.charAt(l));
             l++;
             r--;
           }
           r++;
           

        }
        return max;
    }
}