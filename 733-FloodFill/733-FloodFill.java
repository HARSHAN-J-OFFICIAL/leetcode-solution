// Last updated: 5/25/2026, 11:16:49 AM
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original=image[sr][sc];
        if(original!=color){
            dfs(image,sr,sc,original,color);
        }
        return image;
    }

    public void dfs(int[][] image,int sr,int sc,int color,int newcolor){
        if(sr>=image.length|| sr<0|| sc>=image[0].length|| sc<0){
            return;
        }
        if(image[sr][sc]!=color){
            return;
        }

        image[sr][sc]=newcolor;

        dfs(image,sr+1,sc,color,newcolor);
        dfs(image,sr-1,sc,color,newcolor);
        dfs(image,sr,sc+1,color,newcolor);
        dfs(image,sr,sc-1,color,newcolor);
    }
}