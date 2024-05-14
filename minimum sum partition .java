class Solution
{ 
    public int subset(int  arr[], int n, int sum){
        boolean[][] b=new boolean[n+1][sum+1];
        List<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i==0)
                b[i][j]=false;
                if(j==0)
                b[i][j]=true;
            }
        }
         for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(arr[i-1]<=j){
                    b[i][j]=b[i-1][j] || b[i-1][j-arr[i-1]];
                }
                else{
                    b[i][j]=b[i-1][j];
                }
                if(j<sum/2 +1){
                if(i==n && b[i][j]==true)
                    l.add(j);
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<l.size();i++){
            min=Math.min(min,(sum-2*l.get(i)));
        }
      return min;  
    }

	public int minDifference(int arr[], int n) 
	{ 
	    int sum=0;
	    if(n==1)
	    return arr[0];
	   for(int i=0;i<n;i++){
	       sum+=arr[i];
	   }
	   return subset(arr,n,sum);
	} 
}
