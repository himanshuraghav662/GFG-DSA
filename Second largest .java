class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int largest=arr[0];
        int ans=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                ans=largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>ans){
                ans=arr[i];
            }
        }
     return ans;    
    }
}
