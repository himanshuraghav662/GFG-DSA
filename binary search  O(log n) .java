class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]>k){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        if(arr[start]==k)
        return start;
        else
        return -1;
    }
}
