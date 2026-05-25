// Last updated: 5/25/2026, 11:16:34 AM
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
            return false;
        s=s.concat(s);
        System.out.print(s);
        if(s.contains(goal))
            return true;
        return false;
    }
}