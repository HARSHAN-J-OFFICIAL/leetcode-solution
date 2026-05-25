// Last updated: 5/25/2026, 11:17:56 AM
class Solution {
    public int splitArray(int[] nums, int k) {

        int low = 0;
        int high = 0;

        for(int n : nums){
            low = Math.max(low, n); // largest element
            high += n;              // total sum
        }

        while(low < high){

            int mid = low + (high - low) / 2;

            if(canSplit(nums, k, mid)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canSplit(int[] nums, int k, int maxSum){

        int subarrays = 1;
        int currentSum = 0;

        for(int num : nums){

            if(currentSum + num > maxSum){
                subarrays++;
                currentSum = num;

                if(subarrays > k){
                    return false;
                }

            }else{
                currentSum += num;
            }
        }

        return true;
    }
}