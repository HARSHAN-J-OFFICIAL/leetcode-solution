// Last updated: 5/25/2026, 11:21:33 AM
class Solution {
    public int trap(int[] height) {
        int cnt=0,lmax=0,rmax=0;
        int left=0,right=height.length-1;
        while(left<right){
            if(height[left]<height[right]){
                lmax=Math.max(lmax,height[left]);
                cnt+=lmax-height[left];
                left++;
            }
            else{
                rmax=Math.max(rmax,height[right]);
                cnt+=rmax-height[right];
                right--;
            }
        }
        return cnt;
    }
}