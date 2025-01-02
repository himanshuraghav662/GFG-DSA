class Solution {
    public int countSubarrays(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int currsum=0;
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            if(map.containsKey(currsum-k)==true){
                count+=map.get(currsum-k);
            }
            
            map.put(currsum,map.getOrDefault(currsum,0)+1);
        }
        return count;
    }
}
