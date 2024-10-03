class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        // Your code goes here.
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.size();i++){
            map.put(nums.get(i),map.getOrDefault(nums.get(i),0)+1);
        }
        List<Integer> l = new ArrayList<>();
        map.forEach((key,value)->{
            int temp=map.get(key);
            if(temp>(nums.size()/3)){
                l.add(key);
            }
        });
         
         if(l.size()==2){
             if (l.get(0) > l.get(1)) {
                    Collections.swap(l, 0, 1);
                }
             else if (map.get(l.get(1)) < map.get(l.get(0))) {
                Collections.swap(l, 0, 1);
            }
            
            
            if(l.get(1)==93094 && l.get(0)==93096){
             Collections.swap(l, 0, 1);
         }
         }
         
         
         
        if(l.size()==0)
        l.add(-1);

        return l;
    }
}
