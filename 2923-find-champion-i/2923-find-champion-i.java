class Solution {
    public int findChampion(int[][] grid) {
        int n = grid.length;
        for(int i=0;i<n;i++){
            boolean check = true;
            for(int j=0+i;j<n;j++){
                if(i!=j && grid[i][j] == 0){
                    check = false;
                    break;
                }
            }
            if(check){
                return i;
            }
        }
        return -1;
    }
}