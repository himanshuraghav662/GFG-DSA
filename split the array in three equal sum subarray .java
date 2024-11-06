class Solution {
    // Function to determine if array arr can be split into three equal sum sets.
    public List<Integer> findSplit(int[] arr) {
        // code here
        List<Integer> list=new ArrayList<>(2);
        list.add(-1);
        list.add(-1);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum%3!=0){
            return list;
        }else{
            list.add(0,0);
            int part=sum/3;
            int temp=0;
         for(int i=0;i<arr.length;i++){
          temp+=arr[i];
          if(temp==part){
              if(list.get(1)==-1)
              list.add(1,i);
              
              temp=0;
          }else if(temp>part){
              list.add(0,-1);
               list.add(1,-1);
               return list;
          }
        }
        }
        return list;
    }
}
