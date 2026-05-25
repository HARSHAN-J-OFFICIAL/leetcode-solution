// Last updated: 5/25/2026, 11:19:54 AM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tot=0,curr=0,st=0;
        for(int i=0;i<gas.length;i++) {
            int diff=gas[i]-cost[i];
            tot+=diff;
            curr+=diff;
            if(curr<0){
                st=i+1;
                curr=0;
            }
        }

        return tot>=0 ? st:-1;
    }
}