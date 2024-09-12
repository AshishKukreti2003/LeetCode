class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] direction = {
            {0,1}, // East
            {1,0}, // South
            {0,-1}, // West
            {-1,0} // North
        };
        int[][] result = new int[rows*cols][2];
        int steps = 0, dir = 0, count = 0;
        result[count++] = new int[]{rStart, cStart};
        while(count < rows*cols){
            if(dir == 0 || dir == 2){
                steps++;
            }
            for(int i=0;i<steps;i++){
                rStart += direction[dir][0];
                cStart += direction[dir][1];
                
                if(rStart >= 0 && rStart < rows && cStart >=0 && cStart < cols){
                    result[count++] = new int[]{rStart, cStart};
                }
            }
            dir = (dir+1)%4;
        }
        
        return result;
    }
}