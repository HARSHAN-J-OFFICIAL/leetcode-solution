// Last updated: 5/25/2026, 11:20:45 AM
class Solution {
    List<List<Integer>> res=new ArrayList<>();
    void backTracking(int[] nums,int index,List<Integer>current){
        res.add(new ArrayList<>(current));

        for(int i=index;i<nums.length;i++){
            current.add(nums[i]);

            backTracking(nums,i+1,current);

            current.remove(current.size()-1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
       backTracking(nums,0,new ArrayList<>());
       return res;
    }
}