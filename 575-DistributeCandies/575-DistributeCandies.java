// Last updated: 5/25/2026, 11:17:13 AM
class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length/2;
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            s.add(candyType[i]);
        }
        if(s.size()>=n){
            return n;
        }

            return s.size();
    }
}