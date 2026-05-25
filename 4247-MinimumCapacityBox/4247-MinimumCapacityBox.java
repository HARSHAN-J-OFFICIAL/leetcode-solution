// Last updated: 5/25/2026, 11:13:10 AM
class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int res=0;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<capacity.length;i++){
            if(itemSize<=capacity[i] && max>capacity[i]){
                res=i;
                max=capacity[i];
            }
        }
        return max==Integer.MAX_VALUE?-1:res;
    }
}