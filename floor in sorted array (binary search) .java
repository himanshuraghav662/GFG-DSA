class Solution {

    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x) {
        int ans=-1;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==x)
            return mid;
            else if(arr[mid]<x){
            start=mid+1;
            ans=mid;
            }
            else
            end=mid-1;
        }
        
        return ans;
    }
}
