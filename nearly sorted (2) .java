class Solution {
    // Non-static method, so you need to call it on an instance of the class
    public void nearlySorted(int[] arr, int k) {
        // code
        // if(arr.length==1)
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int temp=0;
        while(temp<=k){
            heap.add(arr[temp]);
            temp++;
        }
        temp=0;
        for(int i=k+1;i<arr.length;i++){
            int tem=heap.poll();
            arr[temp]=tem;
            heap.add(arr[i]);
            temp++;
        }
        while(k>=0){
            int tem=heap.peek();
            heap.remove();
            arr[temp]=tem;
            temp++;
            k--;
        }
        
    }
}
