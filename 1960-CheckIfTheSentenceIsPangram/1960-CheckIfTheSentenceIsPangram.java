// Last updated: 5/25/2026, 11:14:39 AM
class Solution {
    public boolean checkIfPangram(String s) {
        if(s.length()<26){
            return false;
        }
        HashMap<Character,Integer> hs=new HashMap<>();
        String str="qwertyuiopasdfghjklzxcvbnm";
        for(char c:s.toCharArray()){
            hs.put(c,hs.getOrDefault(c,0)+1);
        }
        if(hs.size()!=26){
            return false;
        }
        return true;
    }
}