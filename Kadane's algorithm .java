class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
        int max=Integer.MIN_VALUE;
        int local=0;
        for(int i=0;i<arr.length;i++){
                local+=arr[i];
                if(local>max)
                max=local;
                
                if(local<0)
                local=0;
            }
        
        return max;
    }
}
