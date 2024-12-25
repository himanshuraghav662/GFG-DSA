class Solution {
    public void setMatrixZeroes(int[][] mat) {
          int m = mat.length, n = mat[0].length;
        boolean frz = false;
        boolean fcz = false; 
        for (int j = 0; j < n; j++) {
            if (mat[0][j] == 0) {
                frz = true;
                break;
            }
        }
        for (int i = 0; i < m; i++) {
            if (mat[i][0] == 0) {
                fcz = true;
                break;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (mat[i][j] == 0) {
                    mat[i][0] = 0;
                    mat[0][j] = 0; 
                }
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }
        if (frz) {
            for (int j = 0; j < n; j++) {
                mat[0][j] = 0;
            }
        }
        if (fcz) {
            for (int i = 0; i < m; i++) {
                mat[i][0] = 0;
            }
        } 
    }
}
