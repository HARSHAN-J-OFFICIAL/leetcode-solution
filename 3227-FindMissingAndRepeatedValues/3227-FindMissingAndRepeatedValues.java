// Last updated: 5/25/2026, 11:13:31 AM
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer,Integer> hs=new HashMap<>();
        int arr[]=new int[2];
        int arr1[]=new int[grid.length*grid[0].length];
        int k=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                hs.put(grid[i][j],hs.getOrDefault(grid[i][j],0)+1);
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                int ind=grid[i][j];
                arr1[ind-1]=grid[i][j];
            }
        }
        for(int i:hs.keySet()){
            if(hs.get(i)>1){
                arr[0]=i;
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==i+1){
                continue;
            }
            else{
                arr[1]=i+1;
            }
        }
        return arr;
    }
}