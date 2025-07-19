class Solution {
    public String convertToBase7(int num) {
        int y=num;
        if(num<0){
           num=num*(-1); 
        }
        StringBuilder str=new StringBuilder();
        int q=0;
        int r=0;
        do{
        q=num/7;
        r=num%7;
        str.append(r);
        num=q;
        }while(q!=0);
        String s=str.reverse().toString();
        if(y>=0){
        return s;
        }
        return "-"+s;
    }
}