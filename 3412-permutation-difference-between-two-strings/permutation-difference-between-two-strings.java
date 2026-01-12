class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character,Integer> arr=new HashMap<>();
        Map<Character,Integer> arr2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            arr.put(s.charAt(i),i);
        }
         for(int i=0;i<t.length();i++){
            arr2.put(t.charAt(i),i);
        }
        int sum=0;
        for(int i=0;i<s.length();i++){
           sum+=Math.abs(arr.get(s.charAt(i))-arr2.get(s.charAt(i)));
        }
        return sum;
    }
}