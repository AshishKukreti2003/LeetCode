/**
 * @param {number[]} nums
 * @param {number[]} index
 * @return {number[]}
 */
var createTargetArray = function(nums, index) {
    const arr = [];
    for(let i=0;i<nums.length;i++){
        arr.splice(index[i], 0, nums[i]);
    }
    return arr;
};