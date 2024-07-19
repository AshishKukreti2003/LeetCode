/**
 * @param {number[][]} mat
 * @return {number}
 */
var diagonalSum = function(mat) {
    let sum = 0;
    let n = mat.length;
    for(let i=0;i<n;i++){
        sum+=mat[i][i]+mat[i][n-1-i];
    }
    if(n%2 != 0){
        let op = Math.floor(n/2);
        return sum-=mat[op][op];
    }
    return sum;
};