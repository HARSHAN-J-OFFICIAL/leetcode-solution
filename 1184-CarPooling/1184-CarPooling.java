// Last updated: 5/25/2026, 11:15:33 AM
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int arr[]=new int[1001];

        for(int i=0;i<trips.length;i++){
            int val=trips[i][0];
            int start=trips[i][1];
            int end=trips[i][2];
            arr[start]+=val;
            arr[end]-=val;
        }

        int pre[]=new int[1001];
        pre[0]=arr[0];
        for(int i=1;i<pre.length;i++){
            pre[i]=pre[i-1]+arr[i];
        }

        for(int i=0;i<pre.length;i++){
            if(pre[i]>capacity){
                return false;
            }
        }
        return true;
    }
}