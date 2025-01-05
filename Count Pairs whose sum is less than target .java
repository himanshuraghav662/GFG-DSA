class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        int count=0;
        while(i<j){
            if(arr[i]+arr[j]>=target){
                j--;
            }else{
                count+=j-i;
                i++;
            }
        }
        return count;
    }
}
