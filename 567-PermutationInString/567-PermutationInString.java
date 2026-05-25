// Last updated: 5/25/2026, 11:17:15 AM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
            return false;
        int n=s1.length();
        int m=s2.length();
        int[] arr1=new int[127];
        int[] arr2=new int[127];
        for(int i=0;i<n;i++){
            arr1[s1.charAt(i)]++;
            arr2[s2.charAt(i)]++;
        }
        if(Arrays.equals(arr1,arr2))
            return true;
        
        for(int i=n;i<m;i++){
            arr2[s2.charAt(i)]++;
            arr2[s2.charAt(i-n)]--;

            if(Arrays.equals(arr1,arr2))
                return true;
        }
        return false;

    }
}