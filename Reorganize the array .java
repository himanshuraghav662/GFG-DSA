class Solution {
    public List<Integer> rearrange(List<Integer> arr) {
        // Code here
      List<Integer> result = new ArrayList<>();
       for(int i=0;i<arr.size();i++){
          result.add(-1);
       }
        for(int i=0;i<arr.size();i++){
          if(arr.get(i)!=-1){
              result.set(arr.get(i),arr.get(i));
          }
       }
        
        return result;
    }
}
