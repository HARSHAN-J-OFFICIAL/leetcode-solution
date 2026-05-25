// Last updated: 5/25/2026, 11:17:44 AM
class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> hs=new HashMap<>();
        for(char c:s.toCharArray()){
            hs.put(c,hs.getOrDefault(c,0)+1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(hs.entrySet());
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());
        
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer> entry:list){
            char c=entry.getKey();
            int freq=entry.getValue();
            for(int i=0;i<freq;i++){
                sb.append(c);
            }
        }
        return sb.toString();
        
    }
}