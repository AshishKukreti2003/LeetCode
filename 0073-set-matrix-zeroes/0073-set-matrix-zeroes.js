/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var setZeroes = function(matrix) {
    let row = matrix.length;
    let col = matrix[0].length;
    let rows = [];
    let cols = [];
    for(let i=0;i<row;i++){
        for(let j=0;j<col;j++){
            if(matrix[i][j] === 0){
                rows[i] = true;
                cols[j] = true;
            }
        }
    }
    for(let i=0;i<row;i++){
        if(rows[i]){
            for(let j=0;j<col;j++){
                matrix[i][j] = 0;
            }
        }
    }
    for(let i=0;i<row;i++){
        for(let j=0;j<col;j++){
            if(cols[j]){
                matrix[i][j] = 0;
            }
        }
    }
};