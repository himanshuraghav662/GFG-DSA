TLE  .........O (N^2)

class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        long[] a=new long[n];
        for(int i=0;i<n;i++){
            int flag=0;
            for(int j=i;j<n;j++){
                if(arr[j]>arr[i]){
                    a[i]=arr[j];
                    flag=1;
                     break;
                }
            }
            if(flag==0)
            a[i]=-1;
        
        }
        return a;
    } 
}
