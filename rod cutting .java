
class Solution{
    public int max(int price[],int q[], int n){
        int k=q.length;
        int[][] dp=new int[n+1][k+1];
        for(int i=0;i<=k;i++){
            for(int j=0;j<=n;j++){
                if(j==0){
                    dp[i][j]=0;
                }
                if(i==0){
                    dp[i][j]=0;
            }
            }
        }
        for(int i=1;i<=k;i++){
            for(int j=1;j<=n;j++){
              if(q[i-1]<=j){
                  dp[i][j]=Math.max(price[i-1] + dp[i][j-q[i-1]],dp[i-1][j]);
              }
              else{
                  dp[i][j]=dp[i-1][j];
              }
            }
            }
            return dp[n][k];
        }
    
    public int cutRod(int price[], int n) {
        //code here
        int[] k=new int[n];
        for(int i=0;i<n;i++){
            k[i]=i+1;
        }
        return max(price,k,n);
    }
}
