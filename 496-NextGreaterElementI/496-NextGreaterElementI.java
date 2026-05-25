// Last updated: 5/25/2026, 11:17:37 AM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i:nums2){
            if(st.empty()){
                st.push(i);
            }
            while(!st.empty() && st.peek()<i){
                hs.put(st.pop(),i);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            hs.put(st.pop(),-1);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=hs.get(nums1[i]);
        }
    return nums1;
    }
}