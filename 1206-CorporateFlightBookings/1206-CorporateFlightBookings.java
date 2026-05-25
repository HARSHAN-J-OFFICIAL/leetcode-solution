// Last updated: 5/25/2026, 11:15:32 AM
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int diff[]=new int[n+1];
        int start,end,val;
        for(int i=0;i<bookings.length;i++){
            start=bookings[i][0];
            end=bookings[i][1];
            val=bookings[i][2];
            diff[start-1]+=val;
            diff[end]-=val;
        }

        int ans[]=new int[n];
        ans[0]=diff[0];
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]+diff[i];
        }
        
        return ans;
    }
}