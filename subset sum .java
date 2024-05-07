class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        boolean[][] a= new boolean[N+1][sum+1];
        
          for(int i=0;i<=N;i++){
           for(int j=0;j<=sum;j++){
              if(i==0){
                  a[i][j]=false;
              }
              if(j==0){
                  a[i][j]=true;
              }
           }
        }
         for(int i=1;i<=N;i++){
           for(int j=1;j<=sum;j++){
              if(arr[i-1]<=j)
              a[i][j]=a[i-1][j-arr[i-1]] || a[i-1][j];
              else
              a[i][j]=a[i-1][j];
           }
        }
        
        return a[N][sum];
    }
}
