/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNonDuplicate = function(nums) {
    let start = 0, end = nums.length-1;
    while(start<end){
        let mid = start + Math.floor((end-start)/2);
        if(mid %2 == 1) mid--;
        if(nums[mid] != nums[mid+1]) end = mid;
        else start = mid+2;
    }
    return nums[end];
};