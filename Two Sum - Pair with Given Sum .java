class Solution {
    boolean twoSum(int arr[], int target) {
        HashSet<Integer> set=new HashSet<>();
        set.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(set.contains(target-arr[i])==true){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
