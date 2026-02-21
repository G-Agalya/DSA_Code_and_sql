class Solution {
    public String toGoatLatin(String sen) {
        String[] str=sen.split(" ");
        int h=2;
        String res="";
        for(int i=0;i<str.length;i++){
            char a=str[i].charAt(0);
            String f="";
            if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='U' || a=='O'){
            for(int j=0;j<str[i].length();j++){
              f+=str[i].charAt(j)+"";
            }
            f+="m";
            }
            else{
                for(int j=1;j<str[i].length();j++){
              f+=str[i].charAt(j)+"";
            }
            f+=a+""+"m";
            }
            
            for(int u=0;u<h;u++){
                f+="a";
            }
            h++;
           if(i!=str.length-1){
           res+=f+" ";
           }
           else{
             res+=f+"";
           }
        }
      return res;
    }
}