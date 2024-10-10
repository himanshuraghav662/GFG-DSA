class Solution {
    public int maxDistance(int[] arr) {
        // Code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                max=Math.max(max,i-map.get(arr[i]));
            }
            else
            map.put(arr[i],i);
        }
        
        return max;
    }
}
