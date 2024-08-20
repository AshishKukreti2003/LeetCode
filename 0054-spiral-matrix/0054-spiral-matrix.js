/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var spiralOrder = function(matrix) {
    let m = matrix.length;
    let n = matrix[0].length;
    let array = [];
    let top = 0, left = 0, bottom = m-1, right = n-1;
    while(left <= right && top <= bottom){
        for(let i = left;i <= right ;i++){
            array.push(matrix[top][i]);
        }
        top++;
        for(let i=top;i<=bottom;i++){
            array.push(matrix[i][right]);
        }
        right--;
        if(top<=bottom){
            for(let i=right;i>= left;i--){
               array.push(matrix[bottom][i]); 
            }
            bottom--;
        }
        if (left <= right) {
            for(let i=bottom;i>=top;i--){
                array.push(matrix[i][left]);
            }
            left++;
        }
    }
    
    return array;
};