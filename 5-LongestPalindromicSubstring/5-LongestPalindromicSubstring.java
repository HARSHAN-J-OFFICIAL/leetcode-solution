// Last updated: 5/25/2026, 11:22:22 AM
class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        boolean[][] dp=new boolean[n][n];

        for(int i=0;i<n;i++)
            dp[i][i]=true;

        String res=s.substring(0,1);
        int max_len=1;
        
        for(int len=2;len<=n;len++){
            for(int i=0;i<=n-len;i++){
                int j=i+len-1;
                if (s.charAt(i) == s.charAt(j) && (len == 2 || dp[i + 1][j - 1])){
                    dp[i][j]=true;
                    if(j-i+1>max_len){
                        max_len=j-i+1;
                        res=s.substring(i,j+1);
                    }
                }
            }
        }
        return res;
    }
}