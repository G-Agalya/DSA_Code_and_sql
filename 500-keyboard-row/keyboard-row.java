class Solution {
    public String[] findWords(String[] words) {
        String str1="qwertyuiop";
        String str2="asdfghjkl";
        String str3="zxcvbnm";
        List<String> arr=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String s=words[i].toLowerCase();
            boolean flag=false;
            for(int j=0;j<s.length();j++){
                if(str1.contains(s.charAt(j)+"")){
                   flag=true;
                }
                else{
                    flag=false;
                    break;
                }
            }
            if(flag){
                arr.add(words[i]);
            }
            for(int j=0;j<s.length();j++){
                if(str2.contains(s.charAt(j)+"")){
                   flag=true;
                }
                else{
                    flag=false;
                    break;
                }
            }
            if(flag){
                arr.add(words[i]);
            }
            for(int j=0;j<s.length();j++){
                if(str3.contains(s.charAt(j)+"")){
                   flag=true;
                }
                else{
                    flag=false;
                    break;
                }
            }
            if(flag){
                arr.add(words[i]);
            }
        }
        return arr.toArray(new String[0]);
    }
}