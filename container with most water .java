class Solution {

    public int maxWater(int arr[]) {
        // Code Here
        int i=0;
        int j=arr.length-1;
        int ans=0;
        while(i<j){
            int water=Math.min(arr[i],arr[j]);
            int base=j-i;
            ans=Math.max(ans,water*base);
            if(arr[i]<=arr[j]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}
