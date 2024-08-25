/**
 * @param {number[]} nums
 * @return {number[]}
 */
var leftRightDifference = function(nums) {
    let n = nums.length;
    if(n === 1){
        return [0];
    }
    let left = new Array(n);
    left[0] = 0;
    let right = new Array(n);
    right[n-1] = 0;
    let sum = 0;
    for(let i = 1;i<n;i++){
        sum+=nums[i-1];
        left[i] = sum;
    }
    sum = 0;
    for(let i = n-2;i>=0;i--){
        sum+=nums[i+1];
        right[i] = sum;
    }
    let ans = [];
    for(let i = 0;i<left.length;i++){
        ans.push(Math.abs(left[i]-right[i]));
    }
    return ans;
};
