class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int length=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                length=i+1;
            }
            if(map.containsKey(sum-k)){
            length=Math.max(length,i-map.get(sum-k));
            }
            map.putIfAbsent(sum,i);
        }
        return length;
    }
}
