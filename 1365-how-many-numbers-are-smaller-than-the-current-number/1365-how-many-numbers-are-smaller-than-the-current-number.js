/**
 * @param {number[]} nums
 * @return {number[]}
 */
var smallerNumbersThanCurrent = function(nums) {
    const arr = [];
    
    for(let i=0;i<nums.length;i++){
        let count = 0;
        for(let j=0;j<nums.length;j++){
            if(i!=j && nums[i]>nums[j])
                count++;
        }
        arr.push(count);
    }
    return arr;
};