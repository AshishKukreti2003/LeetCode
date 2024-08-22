/**
 * @param {number[]} nums
 * @return {number}
 */
var findDuplicate = function(nums) {
    const swap = (nums,i,j)=>{
        [nums[i],nums[j]] = [nums[j],nums[i]];
    };
    
    let i=0;
    while(i<nums.length){
        let correct = nums[i] -1;
        if(nums[i] != nums[correct]) 
            swap(nums,i,correct);
        else i++;
    }
    for(let i=0;i<nums.length;i++){
        if(nums[i] != i+1) return nums[i];
    }
};