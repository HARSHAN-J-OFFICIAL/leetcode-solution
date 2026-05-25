// Last updated: 5/25/2026, 11:22:25 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hs=new HashSet<>();
        int max=0;
        int i=0;
        for(int e=0;e<s.length();e++){
            char c=s.charAt(e);

            while(hs.contains(c)){
                hs.remove(s.charAt(i));
                i++;
            }
            max=Math.max(max,e-i+1);
            hs.add(c);
        }
        return max;
    }
}