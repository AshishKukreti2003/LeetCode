/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    let n = nums.length;
    let pre = [];
    let suf = [];
    pre[0] = 1;
    suf[n-1] = 1;
    for(let i=1;i<n;i++){
        pre[i] = pre[i-1]*nums[i-1];
    }
    for(let i=n-2;i>=0;i--){
        suf[i] = suf[i+1]*nums[i+1];
    }
    for(let i=0;i<n;i++){
        nums[i] = pre[i]*suf[i];
    }
    return nums;
};