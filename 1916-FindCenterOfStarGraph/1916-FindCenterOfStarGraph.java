// Last updated: 5/25/2026, 11:14:40 AM
class Solution {
    public int findCenter(int[][] edges) {
        int a=edges[0][0];
        int b=edges[0][1];
        int c=edges[1][0];
        int d=edges[1][1];
        return (a==d || a==c)?a:b;
    }
}