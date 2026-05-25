// Last updated: 5/25/2026, 11:17:18 AM
class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] arr=new boolean[isConnected.length];
        int c=0;
        for(int i=0;i<isConnected.length;i++){
            if(!arr[i]){
                c++;
                dfs(isConnected,arr,i);
            }
        }
        return c;
    }
    public void dfs(int[][] connected,boolean arr[],int s){
        arr[s]=true;
        for(int i=0;i<connected[s].length;i++){
            if(connected[s][i]==1 && !arr[i]){
                dfs(connected,arr,i);
            }
        }
    }
}