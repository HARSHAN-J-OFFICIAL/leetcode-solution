// Last updated: 5/25/2026, 11:14:25 AM
class Solution {
    HashMap<Integer,List<Integer>> hs = new HashMap<>();
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        constructGraph(edges);
        boolean arr[]=new boolean[n];
        return DFS(source,destination,arr);
    }
    public void constructGraph(int[][] l) {
		for(int i = 0;i<l.length;i++) {
			int u = l[i][0];
			int v = l[i][1];
			addEdge(u, v);
		}
	}
	public void addEdge(int u,int v) {
		hs.putIfAbsent(u, new ArrayList<>());
		hs.putIfAbsent(v, new ArrayList<>());
		hs.get(u).add(v);
		hs.get(v).add(u);
	}
    public boolean DFS(int s,int d,boolean[] arr){
        arr[s]=true;
        if(s==d){
            return true;
        }
        for(int i:hs.get(s)){
            if(arr[i]==false){
                if(DFS(i,d,arr)){
                    return true;
                }
            }
        }
        return false;
    }
}