class GFG {
    static void rotate(int mat[][]) {
        // Code Here
        int n=mat.length;
        for(int i=0;i<n;i++){        //transpose
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        
        for(int i=0;i<n;i++){       //reverse
        int k=n-1;
            for(int j=0;j<n/2;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[i][k];
                mat[i][k]=temp;
                k--;
            }
        }
    }
}
