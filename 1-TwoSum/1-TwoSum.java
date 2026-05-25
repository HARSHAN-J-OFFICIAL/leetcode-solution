// Last updated: 5/25/2026, 11:22:28 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int arr[]=new int[2];

        for(int i=0;i<nums.length;i++){
            int sum=target-nums[i];
            if(hs.containsKey(sum)){
                return new int[] {hs.get(sum),i};
            }
            else{
                hs.put(nums[i],i);
            }
        }
        return arr;
    }
}