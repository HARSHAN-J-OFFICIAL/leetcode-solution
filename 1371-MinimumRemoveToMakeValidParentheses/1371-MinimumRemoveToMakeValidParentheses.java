// Last updated: 5/25/2026, 11:15:31 AM
class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb1 = new StringBuilder();
        int open = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
                sb1.append(c);
            } else if (c == ')') {
                if (open == 0)
                    continue;
                else {
                    open--;
                    sb1.append(c);
                }
            } else {
                sb1.append(c);
            }
        }

        StringBuilder sb2 = new StringBuilder();
        int close = 0;

        for (int i = sb1.length() - 1; i >= 0; i--) {
            char c = sb1.charAt(i);

            if (c == ')') {
                close++;
                sb2.append(c);
            } else if (c == '(') {
                if (close == 0)
                    continue;
                else {
                    close--;
                    sb2.append(c);
                }
            } else {
                sb2.append(c);
            }
        }

        return sb2.reverse().toString();
    }
}