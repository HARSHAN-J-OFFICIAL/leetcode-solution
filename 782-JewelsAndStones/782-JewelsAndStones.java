// Last updated: 5/25/2026, 11:16:42 AM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> hs=new HashMap<>();
        for(char i:stones.toCharArray()){
            hs.put(i,hs.getOrDefault(i,0)+1);
        }
        int c=0;
        for(char i:jewels.toCharArray()){
            if(hs.containsKey(i)){
                c=c+hs.get(i);
            }
        }
        return c;
    }
}