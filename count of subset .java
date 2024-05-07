class Solution{

    public int perfectSum(int arr[],int n, int sum) 
    { 
        int[][] dp = new int[n+1][sum+1];
        
        dp[0][0] = 1;
        
        for(int i=1;i<=n;i++){
            for(int j=0;j<=sum;j++){
                
                if(arr[i-1]>j){
                    dp[i][j] = dp[i-1][j];
                }
                else{
                    dp[i][j] = (dp[i-1][j] + dp[i-1][j-arr[i-1]]) % 1000000007;
                }
                
            }
            
        }
        
        return dp[n][sum];
    } 
//     	public int perfectSum(int arr[],int n, int sum) 
// 	{ 
// 	    int[][] a=new int[n+1][sum+1];
// 	    for(int i=0;i<=n;i++){
// 	        for(int j=0;j<=sum;j++){
// 	            if(i==0){
// 	            a[i][j]=0;
// 	            }
// 	            if(j==0){
// 	            a[i][j]=1;
// 	            }
// 	        }
// 	    }
// 	    for(int i=1;i<=n;i++){
// 	        for(int j=1;j<=sum;j++){
// 	            if(arr[i-1]<=j){
// 	                a[i][j]=(a[i-1][j-arr[i-1]] + a[i-1][j])%1000000007;
// 	            }
// 	            else{
// 	                a[i][j]=a[i-1][j];
// 	            }
// 	        }
// 	    }
// 	    return a[n][sum];
// 	} 
}
