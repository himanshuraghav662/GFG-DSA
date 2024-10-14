class Solution {
    // Function to count the number of subarrays which adds to the given sum.
    static int subArraySum(int arr[], int tar) {
        // add your code here
        int count=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            count+=map.getOrDefault(sum-tar,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
