class Solution {
    public static int count(int[] arr, int mid) {
        int cnt = 1; 
        int ps = 0;
        for(int i=0;i<arr.length;i++){
            if(ps+arr[i]<=mid){
                ps+=arr[i];
            }
            else{
                cnt++;
                ps=arr[i];
            }
        }
        return cnt;
    }
    public static int findPages(int[] arr, int k) {
        if (arr.length < k) {
            return -1; 
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        int start = max; 
        int end = sum; 
        while(start<=end){
        int mid=start+(end-start)/2;

            int st=count(arr, mid);
            if(st>k){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return start;
    }
}
