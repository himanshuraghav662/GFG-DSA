class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i=1;i<=arr.length;i++){
            if(set.contains(i)!=true){
                return i;
            }
        }
        return arr.length+1;
    }
}
