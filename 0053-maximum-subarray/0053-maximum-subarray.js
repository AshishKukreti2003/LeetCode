/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    let max = -Infinity;
    let currentSum = 0;
    for(let num of nums){
        currentSum += num;
        if(currentSum > max){
            max = currentSum;
        }
        if(currentSum < 0){
            currentSum = 0;
        }
    }
    return max;
};