// Last updated: 5/25/2026, 11:13:29 AM
class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] pre=new int[n][m];
        pre[0][0]=grid[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                pre[i][j]=grid[i][j]
                    +(i>0 ? pre[i-1][j]:0)
                    +(j>0 ? pre[i][j-1]: 0)
                    -(i>0 && j>0 ? pre[i-1][j-1]:0);
            }
        }

        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(pre[i][j]<=k){
                    c++;
                }
            }
        }
        return c;
    }
}