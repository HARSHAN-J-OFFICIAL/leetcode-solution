// Last updated: 5/25/2026, 11:14:43 AM
class Solution {
    public int largestSubmatrix(int[][] matrix) {
        for(int i=1;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==1){
                    matrix[i][j]=matrix[i-1][j]+1;
                }
            }
        }
        int max=0;
        for(int row[]:matrix){
            int width=1;
            Arrays.sort(row);
            for(int j=row.length-1;j>=0 && row[j]>0;j--){
                int sum=row[j]*width;
                max=Math.max(max,sum);
                width++;
            }
        }

        
        return max;
    }
}