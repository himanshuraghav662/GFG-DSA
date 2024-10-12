class Solution {
    public int pairWithMaxSum(int[] arr) {
        // code here
        if(arr.length<2)
        return -1;
        
        int sum=0;
        
        int i=0;
        int j=1;
        while(j<arr.length){
            sum=Math.max(sum,arr[i]+arr[j]);
            i++;
            j++;
        }
        return sum;
    }
}
