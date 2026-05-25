// Last updated: 5/25/2026, 11:14:05 AM
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int c=0;
        int n=blocks.length();
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                c++;
            }
        }
        int min=c;
        for(int i=1;i<n-k+1;i++){
            if(blocks.charAt(i-1)=='W'){
                c--;
            }
            if(blocks.charAt(i+k-1)=='W'){
                c++;
            }
            if(min>c){
                min=c;
            }
        }
        return min;
    }
}