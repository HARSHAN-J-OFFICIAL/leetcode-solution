// Last updated: 5/25/2026, 11:17:51 AM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> l=new ArrayList<>();
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i:nums){
            hs.put(i,hs.getOrDefault(i,0)+1);
        }
        for(int i:hs.keySet()){
            if(hs.get(i)>1){
                l.add(i);
            }
        }
        return l;
    }
}