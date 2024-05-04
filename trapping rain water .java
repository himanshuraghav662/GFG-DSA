class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int[] a=new int[n];
        int[] b=new int[n];
        a[0]=arr[0];
        int d=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>d){
                a[i]=arr[i];
                d=arr[i];
            }
            else{
                a[i]=d;
            }
        }
         b[n-1]=arr[n-1];
        int e=arr[n-1];
        for(int j=n-2;j>=0;j--){
            if(arr[j]>e){
                b[j]=arr[j];
                e=arr[j];
            }
            else{
                b[j]=e;
            }
        }
        long ans=0;
        for(int i=0;i<n;i++){
            ans+=(Math.min(a[i],b[i]))-arr[i];
        }
        return ans;
    } 
}
