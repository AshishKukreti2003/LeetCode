/**
 * @param {number[][]} mat
 * @param {number} r
 * @param {number} c
 * @return {number[][]}
 */
var matrixReshape = function(mat, r, c) {
    let m = mat.length, n = mat[0].length;
    if(m*n != r*c){
        return mat;
    }
    let matrix = new Array(r).fill(0).map(() => new Array(c).fill(0));
    let row = 0, col = 0;
    for(let i=0;i<m;i++){
        for(let j=0;j<n;j++){
            matrix[row][col++] = mat[i][j];
            if(col === c){
                col = 0;
                row++;
            }
        }
    }
    return matrix;
};