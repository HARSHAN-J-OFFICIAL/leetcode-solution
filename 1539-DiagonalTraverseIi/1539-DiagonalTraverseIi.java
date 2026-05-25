// Last updated: 5/25/2026, 11:15:08 AM
class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Map<Integer,List<Integer>> hs=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.size();i++){
            for(int j=0;j<nums.get(i).size();j++){
                hs.putIfAbsent(i+j,new ArrayList<>());
                hs.get(i+j).add(nums.get(i).get(j));
                count++;
            }
        }
        int res[]=new int[count];
        int t=0;
        for(int i=0;i<hs.size();i++){
            Collections.reverse(hs.get(i));
            for(int j=0;j<hs.get(i).size();j++){
                res[t++]=hs.get(i).get(j);
            }
        }
        return res;

    }
}