class Solution {
    public String[] findRelativeRanks(int[] score) {
        Queue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:score){
            q.add(i);
        }
        Map<Integer,String> map=new HashMap<>();
        int k=1;
        while(!q.isEmpty()){
            int n=q.poll();
            if(k==1){
                map.put(n,"Gold Medal");
               
            }
            else if(k==2){
                map.put(n,"Silver Medal");
              
            }
            else if(k==3){
                map.put(n,"Bronze Medal");
               
            }
            else{
                map.put(n,k+"");
              
            }
            k++;
        }
        String[] str=new String[score.length];
        for(int i=0;i<str.length;i++){
            str[i]=map.get(score[i]);
        }
        return str;
    }
}