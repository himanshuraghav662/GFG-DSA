class Solution {
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int mat[][]) {
        // code here
        int n=mat.length-1;
        for(int i=0;i<mat[0].length;i++){
            for(int j=0;j<=n/2;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[i][n-j];
                mat[i][n-j]=temp;
            }
        }
        
        for(int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat[0].length;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp; 
            }
        }
    }
}
