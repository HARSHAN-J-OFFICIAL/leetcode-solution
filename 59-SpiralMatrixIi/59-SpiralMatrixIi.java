// Last updated: 5/25/2026, 11:21:12 AM
class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int[n][n];
        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;
        int a=1;
        while(top<=bottom && left<=right){
            // left to right
            for(int i=left;i<=right;i++){
                matrix[top][i]=a++;
    
            }
            top++;
            // top to bottom
            for(int i=top;i<=bottom;i++){
                matrix[i][right]=a++;
                
            }
            right--;
            // right to left
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    matrix[bottom][i]=a++;
                    
                }
                bottom--;
            }
            // bottom to top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    matrix[i][left]=a++;
                    
                }
                left++;
            }
        }
        return matrix; 
    }
}