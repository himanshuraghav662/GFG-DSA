TLE  .........O (N^2)

  class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int curr=-2;
            for(int j=0;j<nums2.length;j++){
             if(nums1[i]==nums2[j]){
                 curr=nums1[i];
             }
             if(curr!=-2){
                 if(nums2[j]>curr){
                     ans[i]=nums2[j];
                     curr=-2;
                 }
             }
             if(j==nums2.length-1 && curr!=-2)
             ans[i]=-1;
            }
        }
        return ans;
    }
}
