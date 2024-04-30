class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       int[] a=new int[n];
       int[] b=new int[n];
       int p=arr[0];
       a[0]=arr[0];
       b[0]=arr[n-1];
       int q=arr[n-1];
       int j=n-2;
       for(int i=1;i<n;i++){
           if(arr[i]>p){
           a[i]=arr[i];
           p=arr[i];
           }
           else{
           a[i]=p;
           }
           
           if(arr[j]>q){
               b[j]=arr[j];
               q=arr[j];
           }
           else{
               b[j]=q;
           }
           
           j--;
       }
       int ans=0;
       for(int k=0;k<n;k++){
           if(arr[k]>=a[k] && arr[k]>=b[k])
            ans=k;
       }
       return ans;
    }
}
