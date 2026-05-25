// Last updated: 5/25/2026, 11:15:13 AM
class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]<0){
                    c++;
                }
            }
        }
        return c;
    }
}