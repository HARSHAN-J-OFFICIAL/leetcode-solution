// Last updated: 5/25/2026, 11:19:14 AM
class Solution {
    public void dfs(char[][] grid,int i,int j,int row,int col){
        if(i<0 || j<0 || i>=row || j>=col || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';

        dfs(grid,i-1,j,row,col);
        dfs(grid,i+1,j,row,col);
        dfs(grid,i,j-1,row,col);
        dfs(grid,i,j+1,row,col);
    }
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid,i,j,row,col);
                }
            }
        }
        return count;
    }
}