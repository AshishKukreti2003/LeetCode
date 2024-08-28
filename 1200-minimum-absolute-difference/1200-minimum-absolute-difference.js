/**
 * @param {number[]} arr
 * @return {number[][]}
 */
var minimumAbsDifference = function(arr) {
    let min = Infinity;
    arr.sort((a,b) => a-b);
    for(let i=0;i<arr.length-1;i++){
        min = Math.min(min,Math.abs(arr[i] - arr[i+1]));
    }
    let matrix = [];
    for(let i=0;i<arr.length-1;i++){
        if(Math.abs(arr[i] - arr[i+1]) === min){
            matrix.push([arr[i],arr[i+1]]);
        }
    }
    return matrix;
    
};