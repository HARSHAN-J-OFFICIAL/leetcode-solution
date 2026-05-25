// Last updated: 5/25/2026, 11:20:39 AM
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        int n = heights.length;
        for (int i = 0; i <= heights.length; i++) {
            while (!st.isEmpty() && (i == heights.length || heights[st.peek()] > heights[i])) {
                int h = heights[st.pop()];
                int w = st.isEmpty() ? i : i - st.peek() - 1;
                max = Math.max(h * w, max);
            }
            st.push(i);
        }
        return max;

    }
}