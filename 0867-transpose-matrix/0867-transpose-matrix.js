/**
 * @param {number[][]} matrix
 * @return {number[][]}
 */
var transpose = function(matrix) {
    let m = matrix.length, n = matrix[0].length;
    let arr = new Array(n).fill(0).map(() => new Array(m).fill(0));
    for(let i=0;i<m;i++){
        for(let j=0;j<n;j++){
            arr[j][i] = matrix[i][j];
        }
    }
    return arr;
};