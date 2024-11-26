class Solution {
    public int circularSubarraySum(int arr[]) {   
    int n = arr.length;
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        int maxSum= arr[0];
        int ansMax= arr[0];
        for (int i= 1; i < n; i++) {
            maxSum= Math.max(arr[i], maxSum + arr[i]);
            ansMax= Math.max(ansMax, maxSum);
        }
        int minSum= arr[0];
        int ansMin= arr[0];
        for (int i= 1; i < n; i++) {
            minSum= Math.min(arr[i], minSum + arr[i]);
            ansMin= Math.min(ansMin, minSum);
        }
        if (totalSum== ansMin) {
            return ansMax;
        }
     return Math.max(ansMax, totalSum - ansMin);

    }
}
