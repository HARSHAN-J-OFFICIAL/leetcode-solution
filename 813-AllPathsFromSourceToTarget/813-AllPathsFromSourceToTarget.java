// Last updated: 5/25/2026, 11:16:33 AM
class Solution {
    static List<List<Integer>> res;
    static boolean[] vis;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        res=new ArrayList<>();
        int n=graph.length;
        vis=new boolean[n];

        for(int i=0;i<n;i++){
            vis[i]=false;
        }

        dfs_backtracking(0,n-1,graph,new ArrayList<>());
        return res;
    }
    static void dfs_backtracking(int start,int dest,int[][] graph,List<Integer> l){
        if(start==dest){
            List<Integer> x=new ArrayList<>();
            x.addAll(l);
            x.add(start);
            res.add(x);
            return;
        }
        l.add(start);
        vis[start]=true;
        for(int i:graph[start]){
            if(vis[i]==false){
                dfs_backtracking(i,dest,graph,l);
            }
        }
        vis[start]=false;
        l.remove(l.size()-1);
    }
}