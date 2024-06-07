class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int count = 1;
        int left = 0, right = n-1, top = 0, bottom = n-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                if(count<=n*n){
                    matrix[left][i] = count++;
                }
            }
            top++;
            for(int i=top;i<=bottom;i++){
                if(count<=n*n){
                    matrix[i][right]=count++;
                }
            }
            right--;
            for(int i=right;i>=left;i--){
                if(count<=n*n){
                    matrix[bottom][i] = count++;
                }
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                if(count<=n*n){
                    matrix[i][left]=count++;
                }
            }
            left++;
        }
        return matrix;
    }
}