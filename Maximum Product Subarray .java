class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int a = arr[0]; 
        int b = arr[0];  
        int ans = arr[0]; 
        
        for (int i=1;i<arr.length;i++){
            int tempA=a; 
            a=Math.max(arr[i], Math.max(tempA * arr[i], b * arr[i]));
            b=Math.min(arr[i], Math.min(tempA * arr[i], b * arr[i]));
            
            ans=Math.max(ans,a);
        }
        
        return ans;
    }
}
