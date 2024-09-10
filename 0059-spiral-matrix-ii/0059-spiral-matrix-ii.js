/**
 * @param {number} n
 * @return {number[][]}
 */
var generateMatrix = function(n) {
    let matrix = new Array(n).fill(0).map(() => new Array(n).fill(0));
    let j = 1, top = 0, bottom = n-1, left = 0, right = n-1;
    while(left<=right && top<=bottom){
        for(let i=left;i<=right;i++){
            matrix[top][i] = j++;
        }
        top++;
        for(let i=top;i<=bottom;i++){
            matrix[i][right] = j++;
        }
        right--;
        for(let i=right;i>=left;i--){
            matrix[bottom][i] = j++;
        }
        bottom--;
        for(let i=bottom;i>=top;i--){
            matrix[i][left] = j++;
        }
        left++;
    }
    return matrix;
};