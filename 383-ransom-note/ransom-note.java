class Solution {
    public boolean canConstruct(String r, String m) {
        Map<Character,Integer> arr=new HashMap<>();
        Map<Character,Integer> arr1=new HashMap<>();
        for(char i='a';i<='z';i++){
            arr.put(i,0);
            arr1.put(i,0);
        }
        for(int i=0;i<r.length();i++){
            arr.put(r.charAt(i),arr.getOrDefault(r.charAt(i),0)+1);
        }
        for(int i=0;i<m.length();i++){
            arr1.put(m.charAt(i),arr1.getOrDefault(m.charAt(i),0)+1);
        }
        for(char a:r.toCharArray()){
            if(arr1.get(a)<arr.get(a)){
                return false;
            }
        }
        return true;
    }
}