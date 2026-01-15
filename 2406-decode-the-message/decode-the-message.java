class Solution {
    public String decodeMessage(String key, String mes) {
        String str="";
        if(mes.equals(" ")){
            return " ";
        }
        Map<Character,Integer> arr=new HashMap<>();
        int k=0;
        boolean[] boo=new boolean[20000];
        for(int i=0;i<key.length();i++){
            if(key.charAt(i)!=' ' && boo[key.charAt(i)]==false){
            arr.put(key.charAt(i),k);
            k++;
            boo[key.charAt(i)]=true;
            }
        }
        String[] fox=mes.split(" ");
        for(int i=0;i<fox.length;i++){
            for(int j=0;j<fox[i].length();j++){
                int y=arr.get(fox[i].charAt(j));
           char c=(char)('a'+y);
           str+=c+"";
            }
            str+=" ";
        }
        if(mes.charAt(mes.length()-1)!=' '){
            str=str.trim();
        }

        if(mes.charAt(0)==' ' && mes.charAt(1)==' '){
            str="  "+str;
        }
        
        return str;
    }
}