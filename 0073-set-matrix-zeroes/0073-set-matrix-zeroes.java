class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean[] rows = new boolean[row];
        boolean[] cols = new boolean[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j] == 0){
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        // rows zero
        for(int i=0;i<row;i++){
            if(rows[i])
                for(int j=0;j<col;j++){
                    matrix[i][j] = 0;
                }
        }
        // cols zero
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(cols[j])
                    matrix[i][j] = 0;
            }
        }
    }
}