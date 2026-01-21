class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Set<Integer> arr=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>1){
                arr.add(nums[i]);
            }
        }
        List<Integer> res=new ArrayList<>();
        for(int i:arr){
            res.add(i);
        }
        return res;
    }
}