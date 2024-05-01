class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
        
          for(int i=j;i<n;i++){
            if(a[i]==1){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
        
          for(int i=j;i<n;i++){
            if(a[i]==2){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
    }
}
