class Solution{
    static int subset(int N,int arr[],int s){
        boolean[][] a=new boolean[N+1][s+1];
        for(int i=0;i<=N;i++){
            for(int j=0;j<=s;j++){
                if(i==0){
                    a[i][j]=false;
                }
                if(j==0){
                    a[i][j]=true;
                }
            }
        }
        for(int i=1;i<=N;i++){
            for(int j=1;j<=s;j++){
                if(arr[i-1]<=j)
                a[i][j]=a[i-1][j-arr[i-1]] || a[i-1][j];
                else
                a[i][j]=a[i-1][j];
            }
        }
        if(a[N][s]==true)
        return 1;
        else
        return 0;
    }
    static int equalPartition(int N, int arr[])
    {
        int sum=0;
        int ans;
        for(int i=0;i<N;i++){
            sum+=arr[i];
        }
        int s=sum/2;
        if(sum%2!=0){
            return 0;
        }
        else{
           ans=subset(N,arr,s);
        }
        return ans;
    }
}
