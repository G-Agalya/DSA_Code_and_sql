class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int c=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    c++;
                    break;
                }
            }
        }
        int c1=0;
        for(int i=0;i<nums2.length;i++){
            for(int j=0;j<nums1.length;j++){
                if(nums1[j]==nums2[i]){
                    c1++;
                    break;
                }
            }
            
        }
        int[] arr=new int[2];
            arr[0]=c;
            arr[1]=c1;
            return arr;
    }
}