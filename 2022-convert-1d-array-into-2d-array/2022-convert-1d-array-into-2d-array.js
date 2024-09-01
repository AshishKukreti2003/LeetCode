/**
 * @param {number[]} original
 * @param {number} m
 * @param {number} n
 * @return {number[][]}
 */
var construct2DArray = function(original, m, n) {
    if(m*n !== original.length){
        return [];
    }
    let arr = [];
    let index = 0;
    for(let i=0;i<m;i++){
        let row = [];
        for(let j=0;j<n;j++){
            row.push(original[index++]); 
        }
        arr.push(row);
    }
    return arr;
};