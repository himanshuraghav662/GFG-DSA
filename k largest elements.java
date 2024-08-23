class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        PriorityQueue<Integer> min=new PriorityQueue<>();
        int[] a=new int[k];
        for(int i=0;i<n;i++){
            min.add(arr[i]);
            if(i>=k){
                min.remove();
            }
        }
        for(int i=k-1;i>=0;i--){
            a[i]=min.peek();
            min.remove();
        }
        return a;
    }
}
