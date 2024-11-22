class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
           int n = arr.length;
        int result = arr[n - 1] - arr[0];
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        for (int i = 0; i < n - 1; i++) {
            int currentMax = Math.max(arr[i] + k, largest);
            int currentMin = Math.min(arr[i + 1] - k, smallest);
            if (currentMin < 0) continue;

            result = Math.min(result, currentMax - currentMin);
        }

        return result;
    }
}
