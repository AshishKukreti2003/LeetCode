/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
    let n = nums.length;
    k = k%n;
    let arr = [];
    for(let i=n-k;i<n;i++){
        arr.push(nums[i]);
    }
    for(let i=0;i<n-k;i++){
        arr.push(nums[i]);
    }
    for(let i=0;i<n;i++){
        nums[i] = arr[i];
    }
};