// Last updated: 5/25/2026, 11:19:10 AM
class Solution {
    public int countPrimes(int n) {
         if(n<2){
            return 0;
        }
        boolean arr[]=new boolean[n];
        int count=0;
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i*i<n;i++){
            if(arr[i]){
                for(int j=i*i;j<n;j=j+i){
                    arr[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(arr[i]){
                count++;
            }
        }
        return count;
    }
}