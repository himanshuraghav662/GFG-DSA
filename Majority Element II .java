class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>(2);
        int temp=nums[0];
        int count=1;
        int vote=nums.length/3;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==temp){
                count++;
            }
            else{
                if(count>vote){
                    list.add(temp);
                }
                temp=nums[i];
                count=1;
            }
        }
         if(count>vote){
                    list.add(temp);
                }
        return list;
    }
}
