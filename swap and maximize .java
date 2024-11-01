class Solution {
    public long maxSum(Long[] arr) {
        // code here
       Arrays.sort(arr);
        long ans1 = 0L, ans2 = 0L;
        int n = arr.length;

        // Case 1: Start with the smallest element
        for (int i = 0; i < n / 2; i++) {
            ans1 += 2 * (arr[n - i - 1] - arr[i]);
        }

        // Case 2: Start with the largest element
        for (int i = 1; i <= n / 2; i++) {
            ans2 += 2 * (arr[n - i] - arr[i - 1]);
        }

        return Math.max(ans1, ans2);
    }
}
