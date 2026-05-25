// Last updated: 5/25/2026, 11:20:34 AM
class Solution {

    public int func(int[] heights){
        int ans=0;
        int n=heights.length;
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<=n;i++){
            while(!s.isEmpty() && (i==heights.length || heights[s.peek()]>=heights[i])){
                int l=s.pop();
                int w=s.isEmpty()?i:i-s.peek()-1;
                ans=Math.max(ans,heights[l]*w);
            }
            s.push(i);
        }
        return ans;
    }
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int max=0;
        int heights[]=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='1'){
                    heights[j]++;
                }
                else{
                    heights[j]=0;
                }
            }
            max=Math.max(max,func(heights));
        }
        return max;
    }
}