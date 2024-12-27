class Solution {

    int countPairs(int arr[], int target) {
        // Your code here
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(arr[0],1);
        for(int i=1;i<arr.length;i++){
            if(map.containsKey(target-arr[i])==true){
                ans+=map.get(target-arr[i]);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
      return ans;    
    }
}
