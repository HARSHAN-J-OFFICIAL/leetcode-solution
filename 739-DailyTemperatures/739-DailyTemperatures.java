// Last updated: 5/25/2026, 11:16:48 AM
class Solution {
    public int[] dailyTemperatures(int[] t) {
        int arr[]=new int[t.length];
        int n=t.length;
        int[] r=new int[n];
        int[] s=new int[n];
        int top=-1;
        for(int i=0;i<n;i++){
            while(top!=-1&&t[s[top]]<t[i]){
                int p=s[top--];
                r[p]=i-p;
            }
            s[++top]=i;
        }
     return r;
    }
}