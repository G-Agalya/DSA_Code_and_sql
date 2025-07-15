class Solution {
    public String licenseKeyFormatting(String s, int k) {
        List<Character> arr=new ArrayList<>();
        if(s.length()==1){
            char g=s.charAt(0);
            if(s.charAt(0)>='a' && s.charAt(0)<='z'){
            g=Character.toUpperCase(s.charAt(0));
            }
            if(g=='-'){
                return "";
            }
            return g+"";
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='-'){
                if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                    char c=Character.toUpperCase(s.charAt(i));
                    arr.add(c);
                }
                else{
                arr.add(s.charAt(i));
                }
            }
        }
        StringBuilder str=new StringBuilder();
        if(arr.size()%k==0){
            int h=0;
           for(int i=0;i<arr.size();i++){
              if(h==k){
                str.append("-");
                h=0;
              }
            
              str.append(arr.get(i));
              h++;
           }
        }
        else{
            int num=arr.size()%k;
            for(int i=0;i<num;i++){
              str.append(arr.get(i));
            }
            
            str.append("-");
            int h=0;
            for(int i=num;i<arr.size();i++){
              if(h==k){
                str.append("-");
                h=0;
              }
            
              str.append(arr.get(i));
              h++;
           }
        }
        return str.toString();
    }
}