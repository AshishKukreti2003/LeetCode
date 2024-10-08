/**
 * @param {number[]} nums
 * @return {number}
 */
var maxProductDifference = function(nums) {
    nums.sort((a,b) => a-b);
    let n = nums.length;
    return (nums[n-1]*nums[n-2])-(nums[0]*nums[1]);
};