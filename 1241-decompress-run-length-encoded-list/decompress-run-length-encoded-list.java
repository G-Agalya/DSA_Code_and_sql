class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        int y=0;
        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++){
                arr.add(nums[i+1]);
                y++;
            }

        }
        int[] k=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            k[i]=arr.get(i);
        }
        return k;
    }
}