class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        String[] arr=new String[nums.size()];
        for(int i=0;i<nums.size();i++){
            String s=Integer.toBinaryString(i);
            arr[i]=s;
        }
        int sum=0;
        for(int i=0;i<nums.size();i++){
            int c=0;
            for(int j=0;j<arr[i].length();j++){
                if(arr[i].charAt(j)=='1'){
                    c++;
                }
            }
            if(c==k){
                sum+=nums.get(i);
            }
        }
        return sum;
    }
}