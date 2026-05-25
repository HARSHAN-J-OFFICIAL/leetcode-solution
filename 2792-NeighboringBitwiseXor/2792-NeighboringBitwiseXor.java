// Last updated: 5/25/2026, 11:13:41 AM
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int xor = 0;
        for (int i = 0; i < derived.length; i++)
            xor ^= derived[i];
        if (xor == 0)
            return true;
        return false;
    }
}