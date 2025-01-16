class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
            arr[i]=-1;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int length=0;
        for(int i=0;i<arr.length;i++){
          sum+=arr[i];
          if(sum==0){
              length=i+1;
          }
          if(map.containsKey(sum)){
              length=Math.max(length,i-map.get(sum));
          }
          map.putIfAbsent(sum,i);
        }
        return length;
    }
}
