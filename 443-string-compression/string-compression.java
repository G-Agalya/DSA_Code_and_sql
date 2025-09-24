class Solution {
    public int compress(char[] chars) {
        ArrayList<Character> arr=new ArrayList<>();
        String str="";
        str+=chars[0];
        int c=1;
        for(int i=1;i<chars.length;i++){
            if(chars[i-1]==chars[i]){
                c++;
            }
            else{
                if(c>1){
                    str+=c+"";
                }
                str+=chars[i]+"";
                c=1;
            }
        }
        if(c>1){
            str+=c+"";
        }
        for(int i=0;i<str.length();i++){
            chars[i]=str.charAt(i);
        }
        return str.length();
    }
}