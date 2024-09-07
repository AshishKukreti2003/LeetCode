class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if(m * n != r*c) return mat;
        
        int[][] matrix = new int[r][c];
        int row=0,col=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[row][col++] = mat[i][j];
                if(col == c){
                    col = 0;
                    row++;
                }
            }
        }
        return matrix;
    }
}