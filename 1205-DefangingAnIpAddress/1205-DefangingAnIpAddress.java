// Last updated: 5/25/2026, 11:15:35 AM
class Solution {
    public String defangIPaddr(String address) {
        address= address.replace(".","[.]");



    //    char[] arr=address.toCharArray();
    //    for(int i=0;i<arr.length;i++){
    //         if(arr[i]=='.'){
    //             arr[i]="[.]";
    //         }
    //    } 
    //    address=String.valueOf(arr);
    return address;
    }
}