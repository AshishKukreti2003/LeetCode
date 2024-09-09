/**
 * @param {number[]} position
 * @return {number}
 */
var minCostToMoveChips = function(position) {
    let evenCount = 0, oddCount = 0;
    for(let num of position){
        if(num%2 == 0){
            evenCount++;
        }else{
            oddCount++;
        }
    }
    return Math.min(evenCount,oddCount);
};