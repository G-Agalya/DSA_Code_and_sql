class Solution {
    public boolean checkAlmostEquivalent(String w1, String w2) {
        String h=w1+w2;
        Set<Character> arr=new HashSet<>();
        for(int i=0;i<h.length();i++){
            arr.add(h.charAt(i));
        }
        Map<Character,Integer> m1=new HashMap<>();
        Map<Character,Integer> m2=new HashMap<>();
        for(int i=0;i<w1.length();i++){
            m1.put(w1.charAt(i),m1.getOrDefault(w1.charAt(i),0)+1);
        }
        for(int i=0;i<w2.length();i++){
            m2.put(w2.charAt(i),m2.getOrDefault(w2.charAt(i),0)+1);
        }
        for(char k:arr){
             int y=m1.getOrDefault(k,0);
             int b=m2.getOrDefault(k,0);
             int o=Math.abs(y-b);
             if(o>3){
                return false;
             }
        }
        return true;
    }
}