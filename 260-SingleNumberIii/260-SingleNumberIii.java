// Last updated: 5/25/2026, 11:18:37 AM
class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int n : nums)
            xor ^= n;
        int diff = xor & (-xor);
        int[] res = new int[2];
        for (int n : nums) {
            if ((n & diff) == 0)
                res[0] ^= n;
            else
                res[1] ^= n;
        }
        return res;
    }
}