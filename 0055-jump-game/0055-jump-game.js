/**
 * @param {number[]} nums
 * @return {boolean}
 */
var canJump = function(nums) {
    let indexTarget = nums.length-1;
    for(let i=nums.length-2;i>=0;i--){
        if(indexTarget <= nums[i] + i){
            indexTarget = i;
        }
    }
    return indexTarget == 0;
};