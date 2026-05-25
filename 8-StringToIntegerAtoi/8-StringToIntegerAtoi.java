// Last updated: 5/25/2026, 11:22:19 AM
class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int i = 0, n = s.length();
        while (i < n && s.charAt(i) == ' ')
            i++;
        if (i == n)
            return 0;
        int sign = 1;
        if (i < n && s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        long res = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            res = res * 10 + digit;
            if (sign * res < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            if (sign * res > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            i++;
        }
        return (int) (sign * res);
    }
}