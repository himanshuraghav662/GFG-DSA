class Solution {
    public int countTriplets(int[] arr, int target) {
        // Code Here
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length-2;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            int j=i+1;
            for(int k=i+2;k<arr.length;k++){
                int temp=arr[k]+arr[j];
                if(map.containsKey(target-temp)==true){
                    count+=map.get(target-temp);
                }
            }
        }
        return count;
    }
}
