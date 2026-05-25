// Last updated: 5/25/2026, 11:14:44 AM
class Solution {
    public int minOperations(int[] target, int[] arr) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < target.length; i++) {
            indexMap.put(target[i], i);
        }

        List<Integer> l = new ArrayList<>();
        for (int num : arr) {
            if (indexMap.containsKey(num)) {
                l.add(indexMap.get(num));
            }
        }

        List<Integer> lis = new ArrayList<>();
        for (int num : l) {
            int idx = Collections.binarySearch(lis, num);
            if (idx < 0) idx = -(idx + 1);
            if (idx < lis.size()) lis.set(idx, num);
            else lis.add(num);
        }

        return target.length - lis.size();
    }
}