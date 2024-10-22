class Solution {

    static int sameOccurrence(int arr[], int x, int y) {
        // write code here
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
       int ans=0;
       int diff=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]==x){
               diff=diff+1;
               if(map.containsKey(diff)==true)
               ans+=map.get(diff);
           }
           else if(arr[i]==y){
               diff=diff-1;
               if(map.containsKey(diff)==true)
               ans+=map.get(diff);
           }else{
               if(map.containsKey(diff)==true)
               ans+=map.get(diff);
           }
           map.put(diff,map.getOrDefault(diff,0)+1);
       }
      return ans; 
    }
}
