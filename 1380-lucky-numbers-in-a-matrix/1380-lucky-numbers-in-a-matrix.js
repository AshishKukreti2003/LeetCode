/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var luckyNumbers  = function(matrix) {
    const luckyNumber = [];
    let row = matrix.length;
    let col = matrix[0].length;
    const minInRow = []
    for(let i=0;i<row;i++){
        let minRow = Number.MAX_SAFE_INTEGER;;
        for(let j=0;j<col;j++){
            minRow = Math.min(matrix[i][j], minRow);
        }
        minInRow.push(minRow);
    }
    const minInCol = [];
    for(let i=0;i<col;i++){
        let maxCol = Number.MIN_SAFE_INTEGER;;
        for(let j=0;j<row;j++){
            maxCol = Math.max(matrix[j][i],maxCol);
        }
        minInCol.push(maxCol);
    }
    
    for(let i=0;i<row;i++){
        for(let j=0;j<col;j++){
            if(matrix[i][j] == minInRow[i] && matrix[i][j] == minInCol[j]){
                luckyNumber.push(matrix[i][j]);
            }
        }
    }
    return luckyNumber;
};