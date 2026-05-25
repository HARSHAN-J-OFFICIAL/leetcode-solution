// Last updated: 5/25/2026, 11:17:36 AM
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int arr[] = new int[n * m];
        int row = 0;
        int col = 0;
        for (int i = 0; i < n * m; i++) {
            arr[i] = mat[row][col];
            if ((row + col) % 2 == 0) {
                if (col == m - 1) {
                    row++;
                } else if (row == 0) {
                    col++;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == n - 1)
                    col++;
                else if (col == 0)
                    row++;
                else {
                    col--;
                    row++;
                }
            }
        }
        return arr;
    }
}