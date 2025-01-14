class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int curr=arr[0];
        for(int i=1;i<arr.length;i++){
            int check=sum-curr-arr[i];
            if(check==curr){
                return i;
            }
            curr+=arr[i];
        }
        return -1;
    }
}
