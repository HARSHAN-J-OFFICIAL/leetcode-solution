// Last updated: 5/25/2026, 11:17:52 AM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> l=new ArrayList();
        if(s.length()<p.length())
            return l;
        int fre1[]=new int[26];
        int fre2[]=new int[26];
        int n=s.length();
        int m=p.length();
        for(int i=0;i<m;i++){
            char c1=s.charAt(i);
            char c2=p.charAt(i);
            fre1[c1-'a']++;
            fre2[c2-'a']++;
        }
        if(Arrays.equals(fre1,fre2))
            l.add(0);

        for(int i=m;i<n;i++){
            fre1[s.charAt(i-m)-'a']--;
            fre1[s.charAt(i)-'a']++;
             if(Arrays.equals(fre1,fre2))
                l.add(i-m+1);
        }
        return l;

    }
}