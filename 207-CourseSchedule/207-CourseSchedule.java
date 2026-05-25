// Last updated: 5/25/2026, 11:19:06 AM
class Solution {
    static HashMap<Integer, List<Integer>> map;
    static boolean vis[];

    boolean dfs(int start) {
        if (vis[start]) {
            return false;
        }
        if (!map.containsKey(start) || map.get(start).size() == 0)
            return true;
        vis[start] = true;
        for (int i : map.get(start)) {
            if (dfs(i)==false) {
                return false;
            }
        }
        vis[start] = false;
        map.put(start, new ArrayList<>());
        return true;
    }

    public boolean canFinish(int n, int[][] edge) {
        map = new HashMap<>();
        for (int i = 0; i < edge.length; i++) {
            int u = edge[i][0];
            int v = edge[i][1];
            map.putIfAbsent(u, new ArrayList<>());
            map.get(u).add(v);
        }
        vis = new boolean[n];
        for (int i = 0; i < n; i++) {
           if(!dfs(i)){
            return false;
           }
        }
        return true;
    }
}