// Last updated: 5/25/2026, 11:18:33 AM
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int temp=0,n=citations.length;
        for(int i=0;i<n;i++){
            temp=n-i;
            if(citations[i]>=temp){
                return temp;
            }
        }
        return 0;
    }
}