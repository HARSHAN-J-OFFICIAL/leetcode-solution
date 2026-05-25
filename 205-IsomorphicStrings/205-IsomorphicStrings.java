// Last updated: 5/25/2026, 11:19:09 AM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hs=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            
            if(hs.containsKey(c1) && hs.get(c1)!=c2){
                return false;
            }

            if(!hs.containsKey(c1) && hs.containsValue(c2)){
                return false;
            }
            hs.put(c1,c2);
        }
        return true;
    }
}