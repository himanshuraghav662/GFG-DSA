class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
        int n=mat[0].length-1;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<=n/2;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[i][n-j];
                mat[i][n-j]=temp;
            }
        }
        int k=mat.length-1;
         for(int i=0;i<=k/2;i++){
            for(int j=0;j<=n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[k-i][j];
                mat[k-i][j]=temp;
            }
        }
    }
}
