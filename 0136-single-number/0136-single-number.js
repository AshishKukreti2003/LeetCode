/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    let count = 0;
    for(let i = 0;i<nums.length;i++){
        for(let j = 0;j<nums.length;j++){
            if(i != j){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        if(count >= 1){
            count = 0;
        }else{
            return nums[i];
        }
    }
    return -1;
};