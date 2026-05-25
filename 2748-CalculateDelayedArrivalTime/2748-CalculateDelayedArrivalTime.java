// Last updated: 5/25/2026, 11:13:44 AM
class Solution {
    public int findDelayedArrivalTime(int a, int d) {
        if(a+d<24){
            return a+d;
        }
        if(a+d==24){
            return 0;
        }
        return (a+d-24);
    }
}