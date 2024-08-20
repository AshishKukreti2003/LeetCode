/**
 * @param {number[]} nums
 * @return {number}
 */
var maximumProduct = function(nums) {
    let n = nums.length-1;
    nums.sort((a,b) => a-b);
    return Math.max(nums[0]*nums[1]*nums[n], nums[n]*nums[n-1]*nums[n-2]);
};