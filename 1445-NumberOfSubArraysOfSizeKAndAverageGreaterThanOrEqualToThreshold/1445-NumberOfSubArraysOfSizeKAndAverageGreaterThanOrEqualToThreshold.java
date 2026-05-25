// Last updated: 5/25/2026, 11:15:19 AM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int sum=0;
        int c=0;
        for(int i=0;i<k;i++)
            sum+=arr[i];
        if(sum/k>=t)
            c++;
        
        for(int i=k;i<arr.length;i++){
            sum=sum-arr[i-k]+arr[i];
            if(sum/k>=t)
                c++;
        }
        return c;
    }
}