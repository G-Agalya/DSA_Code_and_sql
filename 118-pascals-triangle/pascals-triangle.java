class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> r=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    r.add(1);
                }
                else{
                    List<Integer> prv=arr.get(i-1);
                    r.add(prv.get(j)+prv.get(j-1));
                }
            }
            arr.add(r);
        }
        return arr;
    }
}