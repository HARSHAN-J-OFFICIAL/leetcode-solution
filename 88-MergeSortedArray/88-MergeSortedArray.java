// Last updated: 5/25/2026, 11:20:37 AM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=m;i<nums1.length;i++){
            nums1[i]=nums2[j++];
        }
        for(int i=0;i<m+n-1;i++){
            for(j=i+1;j<m+n;j++){
                if(nums1[i]>nums1[j]){
                    int temp=nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=temp;
                }
            }
        }
    }
}