/**
 * @param {number[]} nums
 * @return {number[]}
 */
var numberGame = function(nums) {
    nums.sort((a,b) => a-b);
    let arr = [];
    let i = 1;
    while(i<nums.length){
        arr.push(nums[i]);
        arr.push(nums[i-1]);
        i+=2;
    }
    return arr;
};