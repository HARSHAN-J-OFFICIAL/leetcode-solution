// Last updated: 5/25/2026, 11:13:22 AM
class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        long rowSum = 0;
        long colSum = 0;

        long totalSum = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                totalSum += grid[i][j];
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                rowSum += grid[i][j];
            }

            if (rowSum == (totalSum - rowSum))
                return true;
        }

        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) {
                colSum += grid[i][j];
            }

            if (colSum == (totalSum - colSum))
                return true;
        }

        return false;
    }
}