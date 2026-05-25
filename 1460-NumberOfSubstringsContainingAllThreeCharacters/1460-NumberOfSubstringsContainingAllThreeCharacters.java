// Last updated: 5/25/2026, 11:15:14 AM
class Solution {
    public int numberOfSubstrings(String s) {
        Map<Character,Integer> hs=new HashMap<>();
        int co=0;
        int i=0;
        for(int e=0;e<s.length();e++){
            char c=s.charAt(e);
            hs.put(c,hs.getOrDefault(c,0)+1);
            while(hs.size()==3){
                co+=s.length()-e;
                hs.put(s.charAt(i),hs.get(s.charAt(i))-1);
                if(hs.get(s.charAt(i))==0){
                    hs.remove(s.charAt(i));
                }
                i++;
            }
            
        }
        return co;
    }
}