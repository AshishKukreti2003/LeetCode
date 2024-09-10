class Solution {
    public int[][] generateMatrix(int n) {
        int j = 1, top = 0, bottom = n-1, left = 0, right = n-1;
        int[][] matrix = new int[n][n];
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                matrix[top][i] = j;
                j++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                matrix[i][right] = j;
                j++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    matrix[bottom][i] = j;
                    j++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    matrix[i][left] = j;
                    j++;
                }
                left++;
            }
        }
        return matrix;
    }
}