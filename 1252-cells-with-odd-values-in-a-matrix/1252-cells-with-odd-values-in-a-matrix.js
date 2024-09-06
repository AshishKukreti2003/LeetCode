/**
 * @param {number} m
 * @param {number} n
 * @param {number[][]} indices
 * @return {number}
 */
var oddCells = function(m, n, indices) {
    let matrix = new Array(m).fill(0).map(() => new Array(n).fill(0));
    for(let i=0;i<indices.length;i++){
        for(let j=0;j<m;j++){
            matrix[j][indices[i][1]]++;
        }
        for(let j=0;j<n;j++){
            matrix[indices[i][0]][j]++;
        }
    }
    
    let count = 0;
    for(let i=0;i<m;i++){
        for(let j=0;j<n;j++){
            if(matrix[i][j] %2 !=0){
                count++;
            }
        }
    }
    return count;
};