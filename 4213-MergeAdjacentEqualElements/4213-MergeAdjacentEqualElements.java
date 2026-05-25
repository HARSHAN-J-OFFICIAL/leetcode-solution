// Last updated: 5/25/2026, 11:13:17 AM
class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
       Deque<Long> stack = new ArrayDeque<>();

        for (int num : nums) {
            long current = num;

            while (!stack.isEmpty() && stack.peekLast() == current) {
                current += stack.pollLast();
            }

            stack.addLast(current);
        }

        return new ArrayList<>(stack);
    }
}