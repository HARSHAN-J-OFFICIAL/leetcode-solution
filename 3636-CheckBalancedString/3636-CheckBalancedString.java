// Last updated: 5/25/2026, 11:13:25 AM
class Solution {
    public boolean isBalanced(String num) {
        int a[]=new int[num.length()];
        for(int i=0;i<a.length;i++){
            a[i]=num.charAt(i)-'0';
        }
        int sum1=a[0];
        int sum2=0;
        for(int i=1;i<a.length;i++){
            if(i%2==0){
                sum1+=a[i];
            }
            else{
                sum2+=a[i];
            }
        }
        if(sum1==sum2){
            return true;
        }
        else{
            return false;
        }
    }
}