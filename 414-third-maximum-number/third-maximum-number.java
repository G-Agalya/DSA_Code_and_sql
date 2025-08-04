class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set=new TreeSet<>();
        int max=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i:set){
           arr.add(i);
        } 
        if(set.size()<3){
            return arr.get(arr.size()-1);
        }
        else{
           return arr.get(arr.size()-3);
        }
    }
}