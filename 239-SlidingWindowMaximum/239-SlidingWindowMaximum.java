// Last updated: 5/25/2026, 11:18:44 AM
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
        int[] arr=new int[nums.length-k+1];
        int z=0;
        for(int i=0;i<nums.length;i++){
            if(!dq.isEmpty() && dq.peekFirst()==i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.addLast(i);
            if(i>=k-1){
                arr[z++]=nums[dq.peekFirst()];
            }
        }
        return arr;
    }
}