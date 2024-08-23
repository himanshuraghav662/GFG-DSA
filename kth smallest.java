class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        int c=arr.length;
        for(int i=0;i<c;i++){
            max.add(arr[i]);
            if(i>=k){
                max.remove();
            }
        }
        return max.peek();
    }
}
