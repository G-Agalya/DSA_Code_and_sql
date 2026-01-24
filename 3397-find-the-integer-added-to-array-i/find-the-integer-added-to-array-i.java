class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int sum=0;
        int sum1=0;
        for(int i=0;i<nums1.length;i++){
            sum+=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            sum1+=nums2[i];
        }
        int r=sum1-sum;
        int n=nums1.length;
        return r/n;
    }
}