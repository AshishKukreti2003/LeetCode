/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var minOperations = function(nums, k) {
    let count = 0;
    for(let i=0;i<nums.length;i++){
        if(nums[i] < k){
            count++;
        }
    }
    return count;
};