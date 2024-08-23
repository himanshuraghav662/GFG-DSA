class Solution {
    // Function to calculate the difference between the maximum element in the array and
    // a given number k
    public int required(int[] arr, int k) {
        // Your code goes here
        int ans=0;
        int m=0;
        for(int i=0;i<arr.length;i++){
            if(k<arr[i] && arr[i]>m){
                ans=arr[i]-k;
                m=arr[i];
            }
        }
        if(ans==0){
            return -1;
        }
        else{
            return ans;
        }
        
    }
}
