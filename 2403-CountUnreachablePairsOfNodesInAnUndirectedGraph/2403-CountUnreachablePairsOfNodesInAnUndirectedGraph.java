// Last updated: 5/25/2026, 11:14:10 AM
class Solution {
    Map<Integer, List<Integer>> hs = new HashMap<>();
    boolean[] arr;

    public void edge(int[][] edges) {
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            hs.putIfAbsent(u, new ArrayList<>());
            hs.putIfAbsent(v, new ArrayList<>());
            hs.get(u).add(v);
            hs.get(v).add(u);
        }
    }

    public long countPairs(int n, int[][] edges) {
        int c = 0;
        arr = new boolean[n];
        edge(edges);
        long rem=n;
        long res=0;
        for(int i=0;i<n;i++){
            if(!arr[i]){
                long size=dfs(arr,i);
                rem-=size;
                res+=(long)rem*size;
            }

        }
        return res;
    }

    public long dfs(boolean[] arr, int x) {
        arr[x] = true;
        long count = 1; // count this node

        if (hs.containsKey(x)) {
            for (int i : hs.get(x)) {
                if (!arr[i]) {
                    count += dfs(arr, i);
                }
            }
        }
        return count;
    }
}