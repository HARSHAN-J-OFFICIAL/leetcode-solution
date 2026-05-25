// Last updated: 5/25/2026, 11:16:27 AM
class Solution {
    boolean arr[];
    public void DFS(int start,List<List<Integer>> rooms){
        arr[start]=true;
        for(int i:rooms.get(start)){
            if(arr[i]==false){
                DFS(i,rooms);
            }
        }
    }
    
    public boolean canVisitAllRooms(List<List<Integer>> rooms) { 
        arr=new boolean[rooms.size()];      
        DFS(0,rooms);
        for(boolean i:arr){
            if(!i){
                return false;
            }
        }
        return true;
    }

}