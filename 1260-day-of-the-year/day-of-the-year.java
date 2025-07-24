class Solution {
    public int dayOfYear(String date) {
        String[] arr=date.split("-");
        int y=Integer.parseInt(arr[0]);
        if((y%4==0 && y%100!=0)|| (y%400==0)){
            int sum=Integer.parseInt(arr[2],10);
           for(int i=1;i<Integer.parseInt(arr[1],10);i++){
               if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12){
                sum+=31;
               }
               else if(i==2){
                sum+=29;
               }
               else{
                sum+=30;
               }
           }
           return sum;
        }
        else{
             int sum=Integer.parseInt(arr[2],10);
           for(int i=1;i<Integer.parseInt(arr[1],10);i++){
               if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12){
                sum+=31;
               }
               else if(i==2){
                sum+=28;
               }
               else{
                sum+=30;
               }
           }
           return sum;
        }
        
    }
}