// Last updated: 5/25/2026, 11:18:08 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();

        for(int i:nums1){
            hs.add(i);
        }
        for(int i:nums2){
            if(hs.contains(i)){
                hs2.add(i);
            }
        }
        int[] result = new int[hs2.size()];
        int i = 0;
        for (int n : hs2) {
            result[i++] = n;
        }
        return result;
    }
}