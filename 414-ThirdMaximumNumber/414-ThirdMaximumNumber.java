// Last updated: 5/25/2026, 11:17:54 AM
class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        Integer[] arr = hs.toArray(new Integer[0]);
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        if(arr.length<=2){
            return arr[arr.length-1];
        }
        return arr[arr.length-3];
    }
}