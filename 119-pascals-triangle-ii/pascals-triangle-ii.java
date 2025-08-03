class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<rowIndex+1;i++){
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
        List<Integer> arr1=arr.get(rowIndex);
        return arr1;
    }
}