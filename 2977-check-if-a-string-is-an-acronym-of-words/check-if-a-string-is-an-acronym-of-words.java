class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String str="";
        for(int i=0;i<words.size();i++){
            str+=words.get(i).charAt(0)+"";
        }
        if(s.equals(str)){
            return true;
        }
        return false;
    }
}