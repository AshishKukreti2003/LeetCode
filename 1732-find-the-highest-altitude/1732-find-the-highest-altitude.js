/**
 * @param {number[]} gain
 * @return {number}
 */
var largestAltitude = function(gain) {
    const arr = [];
    arr.push(0);
    let sum = 0;
    for(let i=0;i<gain.length;i++){
        sum+=gain[i];
        arr.push(sum);
    }
    let max = 0;
    for(let i=0;i<arr.length;i++){
        max = Math.max(arr[i],max);
    }
    return max;
};