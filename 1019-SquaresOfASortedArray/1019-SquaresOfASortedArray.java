// Last updated: 5/25/2026, 11:15:55 AM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int arr[]=new int[nums.length];
        int ind=nums.length-1;;
        while(i<=j){
            int pro1=nums[i]*nums[i];
            int pro2=nums[j]*nums[j];
            if(pro1<pro2){
                arr[ind]=pro2;
                j--;
            }
            else{
                arr[ind]=pro1;
                i++;
            }
            ind--;
       
        }
        return arr;
    }
}