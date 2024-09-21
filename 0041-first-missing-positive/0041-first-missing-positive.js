/**
 * @param {number[]} nums
 * @return {number}
 */
var firstMissingPositive = function(nums) {
    let i = 0;
    while(i<nums.length){
        let correct = nums[i] -1;
        if(nums[i] <= nums.length && nums[i] > 0 && nums[i] != nums[correct]){
            let temp = nums[i];
            nums[i] = nums[correct];
            nums[correct] = temp;
        }else{
            i++;
        }
    }
    for(let j=0;j<nums.length;j++){
        if(nums[j] != j+1){
            return j+1;
        }
    }
    return nums.length+1;
};