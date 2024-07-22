/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDuplicates = function(nums) {
    let i = 0;
    while(i<nums.length){
        let correct = nums[i] -1;
        if(nums[i] !== nums[correct]){
            swap(nums,i, correct);
        }else{
            i++;
        }
    }
    let arr = []
    for(let j=0;j<nums.length;j++){
        if(nums[j] !== j+1){
            arr.push(nums[j]);
        }
    }
    
    return arr;
    function swap(nums, i, j){
        let temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
};