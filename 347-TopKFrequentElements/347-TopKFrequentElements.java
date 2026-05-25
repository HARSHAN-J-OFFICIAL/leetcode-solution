// Last updated: 5/25/2026, 11:18:10 AM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((int[] a, int[] b) -> a[1] - b[1]);
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] ans = new int[k];
        int idx = 0;

        for (int i : nums)
            hm.put(i, hm.getOrDefault(i, 0) + 1);

        for (int i : hm.keySet()) {
            pq.offer(new int[] { i, hm.get(i) });

            if (pq.size() > k)
                pq.poll();
        }
        while (!pq.isEmpty()) {
            ans[idx++] = pq.poll()[0];
        }
        return ans;
    }
}