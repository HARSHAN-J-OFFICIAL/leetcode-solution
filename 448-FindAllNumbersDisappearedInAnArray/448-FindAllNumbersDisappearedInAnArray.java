// Last updated: 5/25/2026, 11:17:48 AM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> l=new ArrayList<>();
         int i=0;
        int n=nums.length;
       while(i<n){
            int in=nums[i]-1;
            if(nums[i]!=nums[in]){
                int t=nums[i];
                nums[i]=nums[in];
                nums[in]=t;
            }
            else
                i++;
       }

       for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                l.add(i+1);
            }
       }
       return l;
    }
}