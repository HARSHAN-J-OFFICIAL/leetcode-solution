// Last updated: 5/25/2026, 11:22:23 AM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int t=n+m;
        int arr[]=new int[t];
        int i=0;int j=0;
        int k=0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                i++;
            }
            else{
                arr[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<n){
            arr[k]=nums1[i++];
            k++;
        }
        while(j<m){
            arr[k++]=nums2[j++];
        }
        int len=t/2;
        if(t%2!=0)
            return (double)arr[len];
        else{
            return (double)(arr[len]+arr[len-1])/2;
        }
    }
}